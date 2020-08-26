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

public abstract class MemberPointHistoryBase<M extends MemberPointHistoryBase<?>> extends BaseModel<M> implements IBean {

    /**
     * Table fields 
     */
    public enum Fields {
        ID("id"),
        MEMBER_EXT_ID("member_ext_id"),
        DESCRIPTION("description"),
        POINT("point"),
        CHANGED_POINT("changed_point"),
        CHANGED_DATE("changed_date");
        
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

    public void setMemberExtId(Integer var) {
        set(Fields.MEMBER_EXT_ID.toString(), var);
    }

    public Integer getMemberExtId() {
        return (Integer) get(Fields.MEMBER_EXT_ID.toString());
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

    public void setChangedPoint(Integer var) {
        set(Fields.CHANGED_POINT.toString(), var);
    }

    public Integer getChangedPoint() {
        return (Integer) get(Fields.CHANGED_POINT.toString());
    }

    public void setChangedDate(Date var) {
        set(Fields.CHANGED_DATE.toString(), var);
    }

    public Date getChangedDate() {
        return (Date) get(Fields.CHANGED_DATE.toString());
    }


    ///////////////////////////////////////////////////////////////////////////
    
}