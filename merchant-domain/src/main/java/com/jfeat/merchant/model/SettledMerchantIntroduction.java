/*
 *   Copyright (C) 2014-2017 www.kequandian.net
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
package com.jfeat.merchant.model;

import com.jfeat.merchant.model.base.SettledMerchantIntroductionBase;
import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfeat.merchant.model.SettledMerchant;

import java.util.List;

@TableBind(tableName = "t_settled_merchant_introduction")
public class SettledMerchantIntroduction extends SettledMerchantIntroductionBase<SettledMerchantIntroduction> {

    /**
     * Only use for query.
     */
    public static SettledMerchantIntroduction dao = new SettledMerchantIntroduction();

    public List<SettledMerchantIntroduction> findByMerchantId(Integer merchantId) {
        return findByField(Fields.MERCHANT_ID.toString(), merchantId);
    }

    public SettledMerchant getSettledMerchant() {
        return SettledMerchant.dao.findById(getMerchantId());
    }

}
