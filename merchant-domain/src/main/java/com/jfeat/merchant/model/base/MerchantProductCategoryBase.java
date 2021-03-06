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
package com.jfeat.merchant.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfeat.core.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public abstract class MerchantProductCategoryBase<M extends MerchantProductCategoryBase<?>> extends BaseModel<M> implements IBean {

    /**
     * Table fields 
     */
    public enum Fields {
        ID("id"),
        MERCHANT_ID("merchant_id"),
        NAME("name"),
        COVER("cover"),
        VISIBLE("visible"),
        SORT_ORDER("sort_order");
        
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

    public void setMerchantId(Integer var) {
        set(Fields.MERCHANT_ID.toString(), var);
    }

    public Integer getMerchantId() {
        return (Integer) get(Fields.MERCHANT_ID.toString());
    }

    public void setName(String var) {
        set(Fields.NAME.toString(), var);
    }

    public String getName() {
        return (String) get(Fields.NAME.toString());
    }

    public void setCover(String var) {
        set(Fields.COVER.toString(), var);
    }

    public String getCover() {
        return (String) get(Fields.COVER.toString());
    }

    public void setVisible(Integer var) {
        set(Fields.VISIBLE.toString(), var);
    }

    public Integer getVisible() {
        return (Integer) get(Fields.VISIBLE.toString());
    }

    public void setSortOrder(Integer var) {
        set(Fields.SORT_ORDER.toString(), var);
    }

    public Integer getSortOrder() {
        return (Integer) get(Fields.SORT_ORDER.toString());
    }


    ///////////////////////////////////////////////////////////////////////////
    
}
