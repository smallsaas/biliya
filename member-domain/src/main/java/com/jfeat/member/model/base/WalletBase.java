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
package com.jfeat.member.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfeat.core.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public abstract class WalletBase<M extends WalletBase<?>> extends BaseModel<M> implements IBean {

    /**
     * Table fields 
     */
    public enum Fields {
        ID("id"),
        USER_ID("user_id"),
        ACCUMULATIVE_AMOUNT("accumulative_amount"),
        ACCUMULATIVE_GIFT_AMOUNT("accumulative_gift_amount"),
        BALANCE("balance"),
        GIFT_BALANCE("gift_balance"),
        PASSWORD("password"),
        SALT("salt");
        
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

    public void setAccumulativeAmount(BigDecimal var) {
        set(Fields.ACCUMULATIVE_AMOUNT.toString(), var);
    }

    public BigDecimal getAccumulativeAmount() {
        return (BigDecimal) get(Fields.ACCUMULATIVE_AMOUNT.toString());
    }

    public void setAccumulativeGiftAmount(BigDecimal var) {
        set(Fields.ACCUMULATIVE_GIFT_AMOUNT.toString(), var);
    }

    public BigDecimal getAccumulativeGiftAmount() {
        return (BigDecimal) get(Fields.ACCUMULATIVE_GIFT_AMOUNT.toString());
    }

    public void setBalance(BigDecimal var) {
        set(Fields.BALANCE.toString(), var);
    }

    public BigDecimal getBalance() {
        return (BigDecimal) get(Fields.BALANCE.toString());
    }

    public void setGiftBalance(BigDecimal var) {
        set(Fields.GIFT_BALANCE.toString(), var);
    }

    public BigDecimal getGiftBalance() {
        return (BigDecimal) get(Fields.GIFT_BALANCE.toString());
    }

    public void setPassword(String var) {
        set(Fields.PASSWORD.toString(), var);
    }

    public String getPassword() {
        return (String) get(Fields.PASSWORD.toString());
    }

    public void setSalt(String var) {
        set(Fields.SALT.toString(), var);
    }

    public String getSalt() {
        return (String) get(Fields.SALT.toString());
    }


    ///////////////////////////////////////////////////////////////////////////
    
}
