/*
 *   Copyright (C) 2014-2019 www.kequandian.net
 *
 *    The program may be used and/or copied only with the written permission
 *    from www.kequandian.net or in accordance with the terms and
 *    conditions stipulated in the agreement/contract under which the program
 *    has been supplied.
 *
 *    All rights reserved.
 *
 */

/*
 * This file is automatically generated by tools.
 * It defines fields related to the database table.
 *
 * DON'T EDIT IT. OTHERWIDE IT WILL BE OVERRIDE WHEN RE-GENERATING IF TABLE CHANGE.
 */
package com.jfeat.order.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfeat.core.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public abstract class OrderBase<M extends OrderBase<?>> extends BaseModel<M> implements IBean {

    /**
     * Table fields 
     */
    public enum Fields {
        ID("id"),
        USER_ID("user_id"),
        ORDER_NUMBER("order_number"),
        TRADE_NUMBER("trade_number"),
        PAYMENT_TYPE("payment_type"),
        CREATED_DATE("created_date"),
        PAY_DATE("pay_date"),
        CONFIRM_DATE("confirm_date"),
        DELIVER_DATE("deliver_date"),
        DELIVERED_DATE("delivered_date"),
        DEAL_DATE("deal_date"),
        DELIVER_ORDER_NUMBER("deliver_order_number"),
        STATUS("status"),
        TOTAL_PRICE("total_price"),
        FREIGHT("freight"),
        DESCRIPTION("description"),
        REMARK("remark"),
        INVOICE("invoice"),
        INVOICE_TITLE("invoice_title"),
        RECEIVING_TIME("receiving_time"),
        ZIP("zip"),
        CONTACT_USER("contact_user"),
        PHONE("phone"),
        PROVINCE("province"),
        CITY("city"),
        DISTRICT("district"),
        STREET("street"),
        DETAIL("detail"),
        COVER("cover"),
        EXPRESS_NUMBER("express_number"),
        EXPRESS_COMPANY("express_company"),
        EXPRESS_CODE("express_code"),
        SETTLED("settled"),
        PREVIOUS_STATUS("previous_status"),
        IS_DELIVER_REMINDER("is_deliver_reminder"),
        IS_DELETED("is_deleted"),
        POINT_EXCHANGE_RATE("point_exchange_rate"),
        COUPON_INFO("coupon_info"),
        MARKETING("marketing"),
        MARKETING_ID("marketing_id"),
        MARKETING_DESCRIPTION("marketing_description"),
        MID("mid"),
        MNAME("mname"),
        STORE_ID("store_id"),
        STORE_CODE("store_code"),
        STORE_NAME("store_name"),
        STORE_COVER("store_cover"),
        STORE_ADDRESS("store_address"),
        FOLLOWED_STORE_ID("followed_store_id"),
        FOLLOWED_STORE_CODE("followed_store_code"),
        FOLLOWED_STORE_NAME("followed_store_name"),
        FOLLOWED_STORE_COVER("followed_store_cover"),
        BINDING_STORE_ID("binding_store_id"),
        BINDING_STORE_CODE("binding_store_code"),
        BINDING_STORE_NAME("binding_store_name"),
        BINDING_STORE_COVER("binding_store_cover"),
        STORE_GUIDE_USER_ID("store_guide_user_id"),
        STORE_GUIDE_USER_CODE("store_guide_user_code"),
        STORE_GUIDE_USER_NAME("store_guide_user_name"),
        STORE_USER_ID("store_user_id"),
        STORE_USER_CODE("store_user_code"),
        STORE_USER_NAME("store_user_name"),
        INVITER_USER_ID("inviter_user_id"),
        INVITER_USER_NAME("inviter_user_name"),
        TYPE("type"),
        PAY_CREDIT("pay_credit"),
        DELIVERY_TYPE("delivery_type"),
        ORIGIN("origin"),
        COMMENT_ID("comment_id"),
        REFUND_FEE("refund_fee"),
        SUPPLEMENTARY_FEE("supplementary_fee"),
        ORIGIN_PRICE("origin_price"),
        COUPON_PRICE("coupon_price"),
        CREDIT_PRICE("credit_price"),
        EXT_COUPON_ID("ext_coupon_id"),
        EXT_USER_TYPE("ext_user_type"),
        EXT_COUPON_TYPE("ext_coupon_type"),
        EXT_DISCOUNT("ext_discount"),
        EXT_CUTS("ext_cuts");
        
        private String name;
        Fields(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
        public String like(Object obj) {
            return new StringBuilder(this.toString()).append(" LIKE ").append(obj).toString();
        }
        public String eq(Object obj) {
            return new StringBuilder(this.toString()).append("=").append(obj).toString();
        }
        public String ge(Object obj) {
            return new StringBuilder(this.toString()).append(">=").append(obj).toString();
        }
        public String lt(Object obj) {
            return new StringBuilder(this.toString()).append("<").append(obj).toString();
        }
        public String gt(Object obj) {
            return new StringBuilder(this.toString()).append(">").append(obj).toString();
        }
        public String le(Object obj) {
            return new StringBuilder(this.toString()).append("<=").append(obj).toString();
        }
        public String isNull() {
            return new StringBuilder(this.toString()).append(" IS NULL").toString();
        }
        public String notNull() {
            return new StringBuilder(this.toString()).append(" IS NOT NULL").toString();
        }
        public String notEquals(Object obj) {
            return new StringBuilder(this.toString()).append("<>").append(obj).toString();
        }
    }

    public void setId(Integer var) {
        set(Fields.ID.toString(), var);
    }

    public Integer getId() {
        return (Integer) get(Fields.ID.toString());
    }

    public void setUserId(Integer var) {
        set(Fields.USER_ID.toString(), var);
    }

    public Integer getUserId() {
        return (Integer) get(Fields.USER_ID.toString());
    }

    public void setOrderNumber(String var) {
        set(Fields.ORDER_NUMBER.toString(), var);
    }

    public String getOrderNumber() {
        return (String) get(Fields.ORDER_NUMBER.toString());
    }

    public void setTradeNumber(String var) {
        set(Fields.TRADE_NUMBER.toString(), var);
    }

    public String getTradeNumber() {
        return (String) get(Fields.TRADE_NUMBER.toString());
    }

    public void setPaymentType(String var) {
        set(Fields.PAYMENT_TYPE.toString(), var);
    }

    public String getPaymentType() {
        return (String) get(Fields.PAYMENT_TYPE.toString());
    }

    public void setCreatedDate(Date var) {
        set(Fields.CREATED_DATE.toString(), var);
    }

    public Date getCreatedDate() {
        return (Date) get(Fields.CREATED_DATE.toString());
    }

    public void setPayDate(Date var) {
        set(Fields.PAY_DATE.toString(), var);
    }

    public Date getPayDate() {
        return (Date) get(Fields.PAY_DATE.toString());
    }

    public void setConfirmDate(Date var) {
        set(Fields.CONFIRM_DATE.toString(), var);
    }

    public Date getConfirmDate() {
        return (Date) get(Fields.CONFIRM_DATE.toString());
    }

    public void setDeliverDate(Date var) {
        set(Fields.DELIVER_DATE.toString(), var);
    }

    public Date getDeliverDate() {
        return (Date) get(Fields.DELIVER_DATE.toString());
    }

    public void setDeliveredDate(Date var) {
        set(Fields.DELIVERED_DATE.toString(), var);
    }

    public Date getDeliveredDate() {
        return (Date) get(Fields.DELIVERED_DATE.toString());
    }

    public void setDealDate(Date var) {
        set(Fields.DEAL_DATE.toString(), var);
    }

    public Date getDealDate() {
        return (Date) get(Fields.DEAL_DATE.toString());
    }

    public void setDeliverOrderNumber(String var) {
        set(Fields.DELIVER_ORDER_NUMBER.toString(), var);
    }

    public String getDeliverOrderNumber() {
        return (String) get(Fields.DELIVER_ORDER_NUMBER.toString());
    }

    public void setStatus(String var) {
        set(Fields.STATUS.toString(), var);
    }

    public String getStatus() {
        return (String) get(Fields.STATUS.toString());
    }

    public void setTotalPrice(BigDecimal var) {
        set(Fields.TOTAL_PRICE.toString(), var);
    }

    public BigDecimal getTotalPrice() {
        return (BigDecimal) get(Fields.TOTAL_PRICE.toString());
    }

    public void setFreight(BigDecimal var) {
        set(Fields.FREIGHT.toString(), var);
    }

    public BigDecimal getFreight() {
        return (BigDecimal) get(Fields.FREIGHT.toString());
    }

    public void setDescription(String var) {
        set(Fields.DESCRIPTION.toString(), var);
    }

    public String getDescription() {
        return (String) get(Fields.DESCRIPTION.toString());
    }

    public void setRemark(String var) {
        set(Fields.REMARK.toString(), var);
    }

    public String getRemark() {
        return (String) get(Fields.REMARK.toString());
    }

    public void setInvoice(Integer var) {
        set(Fields.INVOICE.toString(), var);
    }

    public Integer getInvoice() {
        return (Integer) get(Fields.INVOICE.toString());
    }

    public void setInvoiceTitle(String var) {
        set(Fields.INVOICE_TITLE.toString(), var);
    }

    public String getInvoiceTitle() {
        return (String) get(Fields.INVOICE_TITLE.toString());
    }

    public void setReceivingTime(String var) {
        set(Fields.RECEIVING_TIME.toString(), var);
    }

    public String getReceivingTime() {
        return (String) get(Fields.RECEIVING_TIME.toString());
    }

    public void setZip(String var) {
        set(Fields.ZIP.toString(), var);
    }

    public String getZip() {
        return (String) get(Fields.ZIP.toString());
    }

    public void setContactUser(String var) {
        set(Fields.CONTACT_USER.toString(), var);
    }

    public String getContactUser() {
        return (String) get(Fields.CONTACT_USER.toString());
    }

    public void setPhone(String var) {
        set(Fields.PHONE.toString(), var);
    }

    public String getPhone() {
        return (String) get(Fields.PHONE.toString());
    }

    public void setProvince(String var) {
        set(Fields.PROVINCE.toString(), var);
    }

    public String getProvince() {
        return (String) get(Fields.PROVINCE.toString());
    }

    public void setCity(String var) {
        set(Fields.CITY.toString(), var);
    }

    public String getCity() {
        return (String) get(Fields.CITY.toString());
    }

    public void setDistrict(String var) {
        set(Fields.DISTRICT.toString(), var);
    }

    public String getDistrict() {
        return (String) get(Fields.DISTRICT.toString());
    }

    public void setStreet(String var) {
        set(Fields.STREET.toString(), var);
    }

    public String getStreet() {
        return (String) get(Fields.STREET.toString());
    }

    public void setDetail(String var) {
        set(Fields.DETAIL.toString(), var);
    }

    public String getDetail() {
        return (String) get(Fields.DETAIL.toString());
    }

    public void setCover(String var) {
        set(Fields.COVER.toString(), var);
    }

    public String getCover() {
        return (String) get(Fields.COVER.toString());
    }

    public void setExpressNumber(String var) {
        set(Fields.EXPRESS_NUMBER.toString(), var);
    }

    public String getExpressNumber() {
        return (String) get(Fields.EXPRESS_NUMBER.toString());
    }

    public void setExpressCompany(String var) {
        set(Fields.EXPRESS_COMPANY.toString(), var);
    }

    public String getExpressCompany() {
        return (String) get(Fields.EXPRESS_COMPANY.toString());
    }

    public void setExpressCode(String var) {
        set(Fields.EXPRESS_CODE.toString(), var);
    }

    public String getExpressCode() {
        return (String) get(Fields.EXPRESS_CODE.toString());
    }

    public void setSettled(Integer var) {
        set(Fields.SETTLED.toString(), var);
    }

    public Integer getSettled() {
        return (Integer) get(Fields.SETTLED.toString());
    }

    public void setPreviousStatus(String var) {
        set(Fields.PREVIOUS_STATUS.toString(), var);
    }

    public String getPreviousStatus() {
        return (String) get(Fields.PREVIOUS_STATUS.toString());
    }

    public void setIsDeliverReminder(Integer var) {
        set(Fields.IS_DELIVER_REMINDER.toString(), var);
    }

    public Integer getIsDeliverReminder() {
        return (Integer) get(Fields.IS_DELIVER_REMINDER.toString());
    }

    public void setIsDeleted(Integer var) {
        set(Fields.IS_DELETED.toString(), var);
    }

    public Integer getIsDeleted() {
        return (Integer) get(Fields.IS_DELETED.toString());
    }

    public void setPointExchangeRate(Integer var) {
        set(Fields.POINT_EXCHANGE_RATE.toString(), var);
    }

    public Integer getPointExchangeRate() {
        return (Integer) get(Fields.POINT_EXCHANGE_RATE.toString());
    }

    public void setCouponInfo(String var) {
        set(Fields.COUPON_INFO.toString(), var);
    }

    public String getCouponInfo() {
        return (String) get(Fields.COUPON_INFO.toString());
    }

    public void setMarketing(String var) {
        set(Fields.MARKETING.toString(), var);
    }

    public String getMarketing() {
        return (String) get(Fields.MARKETING.toString());
    }

    public void setMarketingId(Integer var) {
        set(Fields.MARKETING_ID.toString(), var);
    }

    public Integer getMarketingId() {
        return (Integer) get(Fields.MARKETING_ID.toString());
    }

    public void setMarketingDescription(String var) {
        set(Fields.MARKETING_DESCRIPTION.toString(), var);
    }

    public String getMarketingDescription() {
        return (String) get(Fields.MARKETING_DESCRIPTION.toString());
    }

    public void setMid(Integer var) {
        set(Fields.MID.toString(), var);
    }

    public Integer getMid() {
        return (Integer) get(Fields.MID.toString());
    }

    public void setMname(String var) {
        set(Fields.MNAME.toString(), var);
    }

    public String getMname() {
        return (String) get(Fields.MNAME.toString());
    }

    public void setStoreId(String var) {
        set(Fields.STORE_ID.toString(), var);
    }

    public String getStoreId() {
        return (String) get(Fields.STORE_ID.toString());
    }

    public void setStoreCode(String var) {
        set(Fields.STORE_CODE.toString(), var);
    }

    public String getStoreCode() {
        return (String) get(Fields.STORE_CODE.toString());
    }

    public void setStoreName(String var) {
        set(Fields.STORE_NAME.toString(), var);
    }

    public String getStoreName() {
        return (String) get(Fields.STORE_NAME.toString());
    }

    public void setStoreCover(String var) {
        set(Fields.STORE_COVER.toString(), var);
    }

    public String getStoreCover() {
        return (String) get(Fields.STORE_COVER.toString());
    }

    public void setStoreAddress(String var) {
        set(Fields.STORE_ADDRESS.toString(), var);
    }

    public String getStoreAddress() {
        return (String) get(Fields.STORE_ADDRESS.toString());
    }

    public void setFollowedStoreId(String var) {
        set(Fields.FOLLOWED_STORE_ID.toString(), var);
    }

    public String getFollowedStoreId() {
        return (String) get(Fields.FOLLOWED_STORE_ID.toString());
    }

    public void setFollowedStoreCode(String var) {
        set(Fields.FOLLOWED_STORE_CODE.toString(), var);
    }

    public String getFollowedStoreCode() {
        return (String) get(Fields.FOLLOWED_STORE_CODE.toString());
    }

    public void setFollowedStoreName(String var) {
        set(Fields.FOLLOWED_STORE_NAME.toString(), var);
    }

    public String getFollowedStoreName() {
        return (String) get(Fields.FOLLOWED_STORE_NAME.toString());
    }

    public void setFollowedStoreCover(String var) {
        set(Fields.FOLLOWED_STORE_COVER.toString(), var);
    }

    public String getFollowedStoreCover() {
        return (String) get(Fields.FOLLOWED_STORE_COVER.toString());
    }

    public void setBindingStoreId(String var) {
        set(Fields.BINDING_STORE_ID.toString(), var);
    }

    public String getBindingStoreId() {
        return (String) get(Fields.BINDING_STORE_ID.toString());
    }

    public void setBindingStoreCode(String var) {
        set(Fields.BINDING_STORE_CODE.toString(), var);
    }

    public String getBindingStoreCode() {
        return (String) get(Fields.BINDING_STORE_CODE.toString());
    }

    public void setBindingStoreName(String var) {
        set(Fields.BINDING_STORE_NAME.toString(), var);
    }

    public String getBindingStoreName() {
        return (String) get(Fields.BINDING_STORE_NAME.toString());
    }

    public void setBindingStoreCover(String var) {
        set(Fields.BINDING_STORE_COVER.toString(), var);
    }

    public String getBindingStoreCover() {
        return (String) get(Fields.BINDING_STORE_COVER.toString());
    }

    public void setStoreGuideUserId(String var) {
        set(Fields.STORE_GUIDE_USER_ID.toString(), var);
    }

    public String getStoreGuideUserId() {
        return (String) get(Fields.STORE_GUIDE_USER_ID.toString());
    }

    public void setStoreGuideUserCode(String var) {
        set(Fields.STORE_GUIDE_USER_CODE.toString(), var);
    }

    public String getStoreGuideUserCode() {
        return (String) get(Fields.STORE_GUIDE_USER_CODE.toString());
    }

    public void setStoreGuideUserName(String var) {
        set(Fields.STORE_GUIDE_USER_NAME.toString(), var);
    }

    public String getStoreGuideUserName() {
        return (String) get(Fields.STORE_GUIDE_USER_NAME.toString());
    }

    public void setStoreUserId(String var) {
        set(Fields.STORE_USER_ID.toString(), var);
    }

    public String getStoreUserId() {
        return (String) get(Fields.STORE_USER_ID.toString());
    }

    public void setStoreUserCode(String var) {
        set(Fields.STORE_USER_CODE.toString(), var);
    }

    public String getStoreUserCode() {
        return (String) get(Fields.STORE_USER_CODE.toString());
    }

    public void setStoreUserName(String var) {
        set(Fields.STORE_USER_NAME.toString(), var);
    }

    public String getStoreUserName() {
        return (String) get(Fields.STORE_USER_NAME.toString());
    }

    public void setInviterUserId(String var) {
        set(Fields.INVITER_USER_ID.toString(), var);
    }

    public String getInviterUserId() {
        return (String) get(Fields.INVITER_USER_ID.toString());
    }

    public void setInviterUserName(String var) {
        set(Fields.INVITER_USER_NAME.toString(), var);
    }

    public String getInviterUserName() {
        return (String) get(Fields.INVITER_USER_NAME.toString());
    }

    public void setType(String var) {
        set(Fields.TYPE.toString(), var);
    }

    public String getType() {
        return (String) get(Fields.TYPE.toString());
    }

    public void setPayCredit(Integer var) {
        set(Fields.PAY_CREDIT.toString(), var);
    }

    public Integer getPayCredit() {
        return (Integer) get(Fields.PAY_CREDIT.toString());
    }

    public void setDeliveryType(String var) {
        set(Fields.DELIVERY_TYPE.toString(), var);
    }

    public String getDeliveryType() {
        return (String) get(Fields.DELIVERY_TYPE.toString());
    }

    public void setOrigin(String var) {
        set(Fields.ORIGIN.toString(), var);
    }

    public String getOrigin() {
        return (String) get(Fields.ORIGIN.toString());
    }

    public void setCommentId(String var) {
        set(Fields.COMMENT_ID.toString(), var);
    }

    public String getCommentId() {
        return (String) get(Fields.COMMENT_ID.toString());
    }

    public void setRefundFee(BigDecimal var) {
        set(Fields.REFUND_FEE.toString(), var);
    }

    public BigDecimal getRefundFee() {
        return (BigDecimal) get(Fields.REFUND_FEE.toString());
    }

    public void setSupplementaryFee(BigDecimal var) {
        set(Fields.SUPPLEMENTARY_FEE.toString(), var);
    }

    public BigDecimal getSupplementaryFee() {
        return (BigDecimal) get(Fields.SUPPLEMENTARY_FEE.toString());
    }

    public void setOriginPrice(BigDecimal var) {
        set(Fields.ORIGIN_PRICE.toString(), var);
    }

    public BigDecimal getOriginPrice() {
        return (BigDecimal) get(Fields.ORIGIN_PRICE.toString());
    }

    public void setCouponPrice(BigDecimal var) {
        set(Fields.COUPON_PRICE.toString(), var);
    }

    public BigDecimal getCouponPrice() {
        return (BigDecimal) get(Fields.COUPON_PRICE.toString());
    }

    public void setCreditPrice(BigDecimal var) {
        set(Fields.CREDIT_PRICE.toString(), var);
    }

    public BigDecimal getCreditPrice() {
        return (BigDecimal) get(Fields.CREDIT_PRICE.toString());
    }

    public void setExtCouponId(String var) {
        set(Fields.EXT_COUPON_ID.toString(), var);
    }

    public String getExtCouponId() {
        return (String) get(Fields.EXT_COUPON_ID.toString());
    }

    public void setExtUserType(String var) {
        set(Fields.EXT_USER_TYPE.toString(), var);
    }

    public String getExtUserType() {
        return (String) get(Fields.EXT_USER_TYPE.toString());
    }

    public void setExtCouponType(String var) {
        set(Fields.EXT_COUPON_TYPE.toString(), var);
    }

    public String getExtCouponType() {
        return (String) get(Fields.EXT_COUPON_TYPE.toString());
    }

    public void setExtDiscount(Integer var) {
        set(Fields.EXT_DISCOUNT.toString(), var);
    }

    public Integer getExtDiscount() {
        return (Integer) get(Fields.EXT_DISCOUNT.toString());
    }

    public void setExtCuts(Integer var) {
        set(Fields.EXT_CUTS.toString(), var);
    }

    public Integer getExtCuts() {
        return (Integer) get(Fields.EXT_CUTS.toString());
    }


    ///////////////////////////////////////////////////////////////////////////
    
}