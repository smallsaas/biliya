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
package com.jfeat.product.model;

import com.jfeat.product.model.base.ProductHitWordBase;
import com.jfinal.ext.plugin.tablebind.TableBind;

import java.util.List;

@TableBind(tableName = "t_product_hit_word")
public class ProductHitWord extends ProductHitWordBase<ProductHitWord> {

    /**
     * Only use for query.
     */
    public static ProductHitWord dao = new ProductHitWord();

    public List<ProductHitWord> findTop(int count) {
        return paginate(1, count, "select *", "from t_product_hit_word order by hit desc").getList();
    }

    public ProductHitWord findByName(String name) {
        return findFirst("select * from t_product_hit_word where name=?", name);
    }

    public List<ProductHitWord> findAllOrderByHit(){
        return find("select * from "+this.getTableName()+" order by hit desc");
    }
}