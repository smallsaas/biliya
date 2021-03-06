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
package com.jfeat.partner.model;

import com.jfeat.kit.SqlQuery;
import com.jfeat.partner.model.base.PartnerLevelBase;
import com.jfinal.ext.plugin.tablebind.TableBind;

import java.util.List;

@TableBind(tableName = "t_partner_level")
public class PartnerLevel extends PartnerLevelBase<PartnerLevel> {

    /**
     * Only use for query.
     */
    public static PartnerLevel dao = new PartnerLevel();

    public PartnerLevel getDefault() {
        return findByLevel(1);
    }

    public PartnerLevel findByLevel(int level) {
        String sql = "select * from t_partner_level where `level`=?";
        return findFirst(sql, level);
    }

    public List<PartnerLevel> findAllOrderByDesc(String field) {
        SqlQuery query = new SqlQuery();
        query.from(getTableName());
        query.orderByDesc(field);
        return find(query.sql());
    }
}
