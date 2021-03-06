/*
 *   Copyright (C) 2014-2016 www.kequandian.net
 *
 *    The program may be used and/or copied only with the written permission
 *    from www.kequandian.net or in accordance with the terms and
 *    conditions stipulated in the agreement/contract under which the program
 *    has been supplied.
 *
 *    All rights reserved.
 *
 */

package com.jfeat.settlement.controller;

import com.jfeat.core.BaseController;
import com.jfeat.identity.interceptor.CurrentUserInterceptor;
import com.jfeat.settlement.model.OwnerBalance;
import com.jfinal.aop.Before;
import com.jfinal.kit.StrKit;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;

/**
 * Created by jingfei on 2016/3/22.
 */
@Before(CurrentUserInterceptor.class)
public class OwnerBalanceController extends BaseController {

    @Override
    @RequiresPermissions(value = { "SettlementApplication.view", "settlement.ownerBalance.menu" }, logical = Logical.OR)
    public void index() {
        Integer pageNumber = getParaToInt("pageNumber", 1);
        Integer pageSize = getParaToInt("pageSize", 30);
        Integer userId = null;
        String userName = getPara("id");
        if (StrKit.notBlank(userName) && StringUtils.isNumeric(userName)) {
            userId = Integer.parseInt(userName);
        }
        setAttr("ownerBalances", OwnerBalance.dao.queryRewardBalance(pageNumber, pageSize, userId, userName));
        keepPara();
    }

}
