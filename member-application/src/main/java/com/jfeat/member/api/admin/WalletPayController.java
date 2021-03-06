package com.jfeat.member.api.admin;

import com.jfeat.captcha.CaptchaKit;
import com.jfeat.core.BaseService;
import com.jfeat.core.RestController;
import com.jfeat.core.Service;
import com.jfeat.core.ServiceContext;
import com.jfeat.ext.plugin.validation.Validation;
import com.jfeat.identity.interceptor.CurrentUserInterceptor;
import com.jfeat.identity.model.User;
import com.jfeat.member.model.Wallet;
import com.jfeat.member.service.WalletPayService;
import com.jfeat.member.service.WalletService;
import com.jfeat.service.PayService;
import com.jfeat.service.exception.RetrieveOrderException;
import com.jfinal.aop.Before;
import com.jfinal.aop.Enhancer;
import com.jfinal.ext.route.ControllerBind;
import com.jfinal.kit.Ret;
import com.jfinal.kit.StrKit;

import java.math.BigDecimal;
import java.util.Map;

/**
 * pad端使用钱包支付
 * @author jackyhuang
 * @date 2018/8/28
 */
@ControllerBind(controllerKey = "/rest/admin/wallet_pay")
public class WalletPayController extends RestController {

    private WalletService walletService = Enhancer.enhance(WalletService.class);
    private static final String PAY_SERVICE_SUFFIX = "PayService";

    /**
     * 使用零钱帐户支付
     */
    @Override
    @Validation(rules = { "orderType = required", "orderNumber = required", "captcha = required", "phone = required" })
    public void save() {
        Map<String, Object> map = convertPostJsonToMap();
        String orderType = (String) map.get("orderType");
        String orderNumber = (String) map.get("orderNumber");
        String phone = (String) map.get("phone");
        String captcha = (String) map.get("captcha");
        User user = User.dao.findByPhone(phone);
        if (user == null) {
            renderFailure("user.not.found");
            return;
        }

        Wallet wallet = walletService.getWallet(user.getId());
        if (StrKit.isBlank(wallet.getPassword())) {
            renderFailure("password.not.set");
            return;
        }

        if (!CaptchaKit.verifyCode(phone, captcha)) {
            renderFailure("captcha.invalid");
            return;
        }

        orderType = StrKit.firstCharToUpperCase(StrKit.toCamelCase(orderType));
        String payServiceName = orderType + PAY_SERVICE_SUFFIX;

        Service service = ServiceContext.me().getService(payServiceName);
        if (service == null) {
            logger.error("PayService not found.");
            renderFailure("PayService.not.found");
            return;
        }
        if (service instanceof WalletPayService) {
            logger.error("cannot.use.wallet.to.pay.wallet");
            renderFailure("cannot.use.wallet.to.pay.wallet");
            return;
        }
        PayService payService = (PayService) service;
        Map<String, Object> orderMap = null;
        try {
            orderMap = payService.retrieveToPayOrder(orderNumber);
        } catch (RetrieveOrderException ex) {
            renderFailure("retrieve.order.failure");
            return;
        }
        logger.debug("orderMap = {}", orderMap);
        String description = (String) orderMap.get("description");
        BigDecimal totalPrice = (BigDecimal) orderMap.get("total_price");

        Ret ret = walletService.pay(user.getId(), totalPrice, description);
        if (BaseService.isSucceed(ret)) {
            payService.paidNotify(orderNumber, "WALLET", String.valueOf(ret.getData().get("tradeNumber")), null);
            renderSuccessMessage("ok");
            return;
        }

        renderFailure(BaseService.getMessage(ret));
    }
}
