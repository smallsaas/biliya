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

/*
 * This file is automatically generated by tools.
 * It defines fields related to the database table.
 *
 * DON'T EDIT IT. OTHERWIDE IT WILL BE OVERRIDE WHEN RE-GENERATING IF TABLE CHANGE.
 */
package com.jfeat.eventlog.model.base;

import com.jfeat.core.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public abstract class EventLogBase<M extends EventLogBase<?>> extends BaseModel<M> {

    /**
     * Table fields 
     */
    public enum Fields {
        ID("id"),
        NAME("name"),
        USER("user"),
        USER_AGENT("user_agent"),
        IP("ip"),
        CREATE_TIME("create_time"),
        EVENT_TYPE("event_type"),
        DATA("data");
        
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
        public String le(Object obj) {
            return new StringBuilder(this.toString()).append("<=").append(obj).toString();
        }
        public String isNull() {
            return new StringBuilder(this.toString()).append(" IS NULL").toString();
        }
        public String notNull() {
            return new StringBuilder(this.toString()).append(" NOT NULL").toString();
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

    public void setName(String var) {
        set(Fields.NAME.toString(), var);
    }

    public String getName() {
        return (String) get(Fields.NAME.toString());
    }

    public void setUser(String var) {
        set(Fields.USER.toString(), var);
    }

    public String getUser() {
        return (String) get(Fields.USER.toString());
    }

    public void setUserAgent(String var) {
        set(Fields.USER_AGENT.toString(), var);
    }

    public String getUserAgent() {
        return (String) get(Fields.USER_AGENT.toString());
    }

    public void setIp(String var) {
        set(Fields.IP.toString(), var);
    }

    public String getIp() {
        return (String) get(Fields.IP.toString());
    }

    public void setCreateTime(Date var) {
        set(Fields.CREATE_TIME.toString(), var);
    }

    public Date getCreateTime() {
        return (Date) get(Fields.CREATE_TIME.toString());
    }

    public void setEventType(String var) {
        set(Fields.EVENT_TYPE.toString(), var);
    }

    public String getEventType() {
        return (String) get(Fields.EVENT_TYPE.toString());
    }

    public void setData(String var) {
        set(Fields.DATA.toString(), var);
    }

    public String getData() {
        return (String) get(Fields.DATA.toString());
    }

    
    ///////////////////////////////////////////////////////////////////////////
    
}