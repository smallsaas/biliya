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
 * It defines the model for the table. All customize operation should 
 * be written here. Such as query/update/delete.
 * The controller calls this object.
 */
package com.jfeat.product.model;

import com.jfeat.product.model.base.ProductTagBase;
import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.util.List;

@TableBind(tableName = "t_product_tag")
public class ProductTag extends ProductTagBase<ProductTag> {

    /**
     * Only use for query.
     */
    public static ProductTag dao = new ProductTag();

    @Override
    public List<ProductTag> findAll() {
        return find("select * from t_product_tag order by sort_order, id");
    }

    public ProductTag findByIdentifier(String identifier) {
        return findFirstByField(Fields.IDENTIFIER.toString(), identifier);
    }

    public List<ProductTag> findByProductId(Integer productId) {
        return find("select a.* from t_product_tag a join t_product_tag_relation b on a.id = b.tag_id where b.product_id = ?", productId);
    }

    public boolean deleteByProductId(Integer productId) {
        return Db.update("delete from t_product_tag_relation where product_id = ?", productId) > 0;
    }

    public boolean addProduct(Integer tagId, Integer productId) {
        Record record = new Record();
        record.set("product_id", productId);
        record.set("tag_id", tagId);
        return Db.save("t_product_tag_relation", record);
    }
}