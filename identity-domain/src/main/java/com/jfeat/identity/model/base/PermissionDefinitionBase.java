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
package com.jfeat.identity.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfeat.core.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public abstract class PermissionDefinitionBase<M extends PermissionDefinitionBase<?>> extends BaseModel<M> implements IBean {

    /**
     * Table fields 
     */
    public enum Fields {
        IDENTIFIER("identifier"),
        NAME("name"),
        DESCRIPTION("description"),
        GROUP_IDENTIFIER("group_identifier");
        
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

    public void setIdentifier(String var) {
        set(Fields.IDENTIFIER.toString(), var);
    }

    public String getIdentifier() {
        return (String) get(Fields.IDENTIFIER.toString());
    }

    public void setName(String var) {
        set(Fields.NAME.toString(), var);
    }

    public String getName() {
        return (String) get(Fields.NAME.toString());
    }

    public void setDescription(String var) {
        set(Fields.DESCRIPTION.toString(), var);
    }

    public String getDescription() {
        return (String) get(Fields.DESCRIPTION.toString());
    }

    public void setGroupIdentifier(String var) {
        set(Fields.GROUP_IDENTIFIER.toString(), var);
    }

    public String getGroupIdentifier() {
        return (String) get(Fields.GROUP_IDENTIFIER.toString());
    }


    ///////////////////////////////////////////////////////////////////////////
    
}
