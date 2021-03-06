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
package com.jfeat.product.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfeat.core.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public abstract class CarryModeBase<M extends CarryModeBase<?>> extends BaseModel<M> implements IBean {

    /**
     * Table fields 
     */
    public enum Fields {
        ID("id"),
        FARE_ID("fare_id"),
        REGION("region"),
        FIRST_PIECE("first_piece"),
        FIRST_WEIGHT("first_weight"),
        FIRST_BULK("first_bulk"),
        FIRST_AMOUNT("first_amount"),
        SECOND_PIECE("second_piece"),
        SECOND_WEIGHT("second_weight"),
        SECOND_BULK("second_bulk"),
        SECOND_AMOUNT("second_amount"),
        CARRY_WAY("carry_way"),
        IS_DEFAULT("is_default");
        
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

    public void setFareId(Integer var) {
        set(Fields.FARE_ID.toString(), var);
    }

    public Integer getFareId() {
        return (Integer) get(Fields.FARE_ID.toString());
    }

    public void setRegion(String var) {
        set(Fields.REGION.toString(), var);
    }

    public String getRegion() {
        return (String) get(Fields.REGION.toString());
    }

    public void setFirstPiece(Integer var) {
        set(Fields.FIRST_PIECE.toString(), var);
    }

    public Integer getFirstPiece() {
        return (Integer) get(Fields.FIRST_PIECE.toString());
    }

    public void setFirstWeight(Integer var) {
        set(Fields.FIRST_WEIGHT.toString(), var);
    }

    public Integer getFirstWeight() {
        return (Integer) get(Fields.FIRST_WEIGHT.toString());
    }

    public void setFirstBulk(Integer var) {
        set(Fields.FIRST_BULK.toString(), var);
    }

    public Integer getFirstBulk() {
        return (Integer) get(Fields.FIRST_BULK.toString());
    }

    public void setFirstAmount(BigDecimal var) {
        set(Fields.FIRST_AMOUNT.toString(), var);
    }

    public BigDecimal getFirstAmount() {
        return (BigDecimal) get(Fields.FIRST_AMOUNT.toString());
    }

    public void setSecondPiece(Integer var) {
        set(Fields.SECOND_PIECE.toString(), var);
    }

    public Integer getSecondPiece() {
        return (Integer) get(Fields.SECOND_PIECE.toString());
    }

    public void setSecondWeight(Integer var) {
        set(Fields.SECOND_WEIGHT.toString(), var);
    }

    public Integer getSecondWeight() {
        return (Integer) get(Fields.SECOND_WEIGHT.toString());
    }

    public void setSecondBulk(Integer var) {
        set(Fields.SECOND_BULK.toString(), var);
    }

    public Integer getSecondBulk() {
        return (Integer) get(Fields.SECOND_BULK.toString());
    }

    public void setSecondAmount(BigDecimal var) {
        set(Fields.SECOND_AMOUNT.toString(), var);
    }

    public BigDecimal getSecondAmount() {
        return (BigDecimal) get(Fields.SECOND_AMOUNT.toString());
    }

    public void setCarryWay(Integer var) {
        set(Fields.CARRY_WAY.toString(), var);
    }

    public Integer getCarryWay() {
        return (Integer) get(Fields.CARRY_WAY.toString());
    }

    public void setIsDefault(Integer var) {
        set(Fields.IS_DEFAULT.toString(), var);
    }

    public Integer getIsDefault() {
        return (Integer) get(Fields.IS_DEFAULT.toString());
    }


    ///////////////////////////////////////////////////////////////////////////
    
}
