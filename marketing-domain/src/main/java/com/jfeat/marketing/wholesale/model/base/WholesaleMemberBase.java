/*
 *   Copyright (C) 2014-2018 www.kequandian.net
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
package com.jfeat.marketing.wholesale.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfeat.core.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public abstract class WholesaleMemberBase<M extends WholesaleMemberBase<?>> extends BaseModel<M> implements IBean {

    /**
     * Table fields 
     */
    public enum Fields {
        ID("id"),
        WHOLESALE_ID("wholesale_id"),
        USER_ID("user_id"),
        CREATED_TIME("created_time"),
        STATUS("status"),
        USER_NAME("user_name"),
        USER_REAL_NAME("user_real_name"),
        USER_PHONE("user_phone"),
        ORDER_NUMBER("order_number"),
        TOTAL_PRICE("total_price");
        
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

    public void setWholesaleId(Integer var) {
        set(Fields.WHOLESALE_ID.toString(), var);
    }

    public Integer getWholesaleId() {
        return (Integer) get(Fields.WHOLESALE_ID.toString());
    }

    public void setUserId(Integer var) {
        set(Fields.USER_ID.toString(), var);
    }

    public Integer getUserId() {
        return (Integer) get(Fields.USER_ID.toString());
    }

    public void setCreatedTime(Date var) {
        set(Fields.CREATED_TIME.toString(), var);
    }

    public Date getCreatedTime() {
        return (Date) get(Fields.CREATED_TIME.toString());
    }

    public void setStatus(String var) {
        set(Fields.STATUS.toString(), var);
    }

    public String getStatus() {
        return (String) get(Fields.STATUS.toString());
    }

    public void setUserName(String var) {
        set(Fields.USER_NAME.toString(), var);
    }

    public String getUserName() {
        return (String) get(Fields.USER_NAME.toString());
    }

    public void setUserRealName(String var) {
        set(Fields.USER_REAL_NAME.toString(), var);
    }

    public String getUserRealName() {
        return (String) get(Fields.USER_REAL_NAME.toString());
    }

    public void setUserPhone(String var) {
        set(Fields.USER_PHONE.toString(), var);
    }

    public String getUserPhone() {
        return (String) get(Fields.USER_PHONE.toString());
    }

    public void setOrderNumber(String var) {
        set(Fields.ORDER_NUMBER.toString(), var);
    }

    public String getOrderNumber() {
        return (String) get(Fields.ORDER_NUMBER.toString());
    }

    public void setTotalPrice(BigDecimal var) {
        set(Fields.TOTAL_PRICE.toString(), var);
    }

    public BigDecimal getTotalPrice() {
        return (BigDecimal) get(Fields.TOTAL_PRICE.toString());
    }


    ///////////////////////////////////////////////////////////////////////////
    
}
