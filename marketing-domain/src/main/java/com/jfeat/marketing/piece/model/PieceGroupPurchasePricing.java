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
package com.jfeat.marketing.piece.model;

import com.jfeat.marketing.piece.model.base.PieceGroupPurchasePricingBase;
import com.jfinal.ext.plugin.tablebind.TableBind;

import java.util.List;

@TableBind(tableName = "t_piece_group_purchase_pricing")
public class PieceGroupPurchasePricing extends PieceGroupPurchasePricingBase<PieceGroupPurchasePricing> {

    /**
     * Only use for query.
     */
    public static PieceGroupPurchasePricing dao = new PieceGroupPurchasePricing();

    public List<PieceGroupPurchasePricing> findByPieceGroupPurchaseId(Integer pieceGroupPurchaseId) {
        return findByField(Fields.PIECE_GROUP_PURCHASE_ID.toString(), pieceGroupPurchaseId, new String[]{Fields.PARTICIPATOR_COUNT.toString()}, null);
    }

    public PieceGroupPurchase getPieceGroupPurchase() {
        return PieceGroupPurchase.dao.findById(getPieceGroupPurchaseId());
    }

}
