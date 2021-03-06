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
 * It defines the model for the table. All customize operation should 
 * be written here. Such as query/update/delete.
 * The controller calls this object.
 */
package com.jfeat.member.model;

import com.jfeat.member.model.base.CouponTemplateBase;
import com.jfinal.ext.plugin.tablebind.TableBind;

@TableBind(tableName = "t_coupon_template")
public class CouponTemplate extends CouponTemplateBase<CouponTemplate> {

    /**
     * Only use for query.
     */
    public static CouponTemplate dao = new CouponTemplate();

    public static final String TYPE_PRODUCT = "PRODUCT";
    public static final String TYPE_ORDER = "ORDER";
    public static final String TYPE_MARKETING_PREFIX = "MARKETING_";
}
