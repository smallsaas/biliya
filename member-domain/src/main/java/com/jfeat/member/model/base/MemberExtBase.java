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

public abstract class MemberExtBase<M extends MemberExtBase<?>> extends BaseModel<M> implements IBean {

    /**
     * Table fields 
     */
    public enum Fields {
        ID("id"),
        USER_ID("user_id"),
        LEVEL_ID("level_id"),
        NAME("name"),
        SEX("sex"),
        BIRTHDAY("birthday"),
        MOBILE("mobile"),
        ADDRESS("address"),
        DESCRIPTION("description"),
        POINT("point"),
        TOTAL_CREDIT("total_credit"),
        CREDIT("credit"),
        BE_MEMBER_TIME("be_member_time"),
        CONSUME_AMOUNT("consume_amount"),
        CONSUME_COUNT("consume_count"),
        LAST_CONSUME_TIME("last_consume_time");
        
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

    public void setLevelId(Integer var) {
        set(Fields.LEVEL_ID.toString(), var);
    }

    public Integer getLevelId() {
        return (Integer) get(Fields.LEVEL_ID.toString());
    }

    public void setName(String var) {
        set(Fields.NAME.toString(), var);
    }

    public String getName() {
        return (String) get(Fields.NAME.toString());
    }

    public void setSex(Integer var) {
        set(Fields.SEX.toString(), var);
    }

    public Integer getSex() {
        return (Integer) get(Fields.SEX.toString());
    }

    public void setBirthday(String var) {
        set(Fields.BIRTHDAY.toString(), var);
    }

    public String getBirthday() {
        return (String) get(Fields.BIRTHDAY.toString());
    }

    public void setMobile(String var) {
        set(Fields.MOBILE.toString(), var);
    }

    public String getMobile() {
        return (String) get(Fields.MOBILE.toString());
    }

    public void setAddress(String var) {
        set(Fields.ADDRESS.toString(), var);
    }

    public String getAddress() {
        return (String) get(Fields.ADDRESS.toString());
    }

    public void setDescription(String var) {
        set(Fields.DESCRIPTION.toString(), var);
    }

    public String getDescription() {
        return (String) get(Fields.DESCRIPTION.toString());
    }

    public void setPoint(Integer var) {
        set(Fields.POINT.toString(), var);
    }

    public Integer getPoint() {
        return (Integer) get(Fields.POINT.toString());
    }

    public void setTotalCredit(Integer var) {
        set(Fields.TOTAL_CREDIT.toString(), var);
    }

    public Integer getTotalCredit() {
        return (Integer) get(Fields.TOTAL_CREDIT.toString());
    }

    public void setCredit(Integer var) {
        set(Fields.CREDIT.toString(), var);
    }

    public Integer getCredit() {
        return (Integer) get(Fields.CREDIT.toString());
    }

    public void setBeMemberTime(Date var) {
        set(Fields.BE_MEMBER_TIME.toString(), var);
    }

    public Date getBeMemberTime() {
        return (Date) get(Fields.BE_MEMBER_TIME.toString());
    }

    public void setConsumeAmount(Integer var) {
        set(Fields.CONSUME_AMOUNT.toString(), var);
    }

    public Integer getConsumeAmount() {
        return (Integer) get(Fields.CONSUME_AMOUNT.toString());
    }

    public void setConsumeCount(Integer var) {
        set(Fields.CONSUME_COUNT.toString(), var);
    }

    public Integer getConsumeCount() {
        return (Integer) get(Fields.CONSUME_COUNT.toString());
    }

    public void setLastConsumeTime(Date var) {
        set(Fields.LAST_CONSUME_TIME.toString(), var);
    }

    public Date getLastConsumeTime() {
        return (Date) get(Fields.LAST_CONSUME_TIME.toString());
    }


    ///////////////////////////////////////////////////////////////////////////
    
}
