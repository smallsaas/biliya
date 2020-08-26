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
package com.jfeat.partner.model;

import com.google.common.collect.Lists;
import com.jfeat.kit.SqlQuery;
import com.jfeat.partner.model.base.PhysicalPurchaseJournalBase;
import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Page;

import java.util.List;

@TableBind(tableName = "t_physical_purchase_journal")
public class PhysicalPurchaseJournal extends PhysicalPurchaseJournalBase<PhysicalPurchaseJournal> {

    /**
     * Only use for query.
     */
    public static PhysicalPurchaseJournal dao = new PhysicalPurchaseJournal();

    public Page<PhysicalPurchaseJournal> pagination(int pageNumber, int pageSize, String startDate, String endDate, Integer sellerId) {
        List<Object> params = Lists.newArrayList();
        String select = "select *, u.name as user_name, u.uid, u.real_name as real_name, u.phone as phone";
        StringBuilder query = new StringBuilder("from t_physical_purchase_journal p ");
        query.append("join t_seller s on s.id=p.seller_id join t_user u on u.id=s.user_id ");
        String cond = " where ";
        if (StrKit.notBlank(startDate)) {
            query.append(cond);
            query.append("p.created_date>=?");
            params.add(startDate);
            cond = " and ";
        }
        if (StrKit.notBlank(endDate)) {
            query.append(cond);
            query.append("p.created_date<=?");
            params.add(endDate);
            cond = " and ";
        }
        if (sellerId != null) {
            query.append(cond);
            query.append("p.seller_id=?");
            params.add(sellerId);
            cond = " and ";
        }
        query.append(" order by p.created_date desc ");
        return paginate(pageNumber, pageSize, select, query.toString(), params.toArray());
    }

    /**
     *
     * @param sellerId
     * @param month 格式为 yyyy-MM
     * @return
     */
    public List<PhysicalPurchaseJournal> findBySellerIdMonth(int sellerId, String month) {
        SqlQuery query = new SqlQuery();
        List<Object> params = Lists.newLinkedList();
        query.from(getTableName()).where(Fields.SELLER_ID.eq("?"));
        params.add(sellerId);
        if (StrKit.notBlank(month)) {
            query.and(Fields.CREATED_DATE.like("?"));
            params.add(month + "%");
        }
        query.orderByDesc(Fields.CREATED_DATE.toString());
        return find(query.sql(), params.toArray());
    }

    /**
     *
     * @param sellerId
     * @param firstDayOfMonth 格式为 yyyy-MM-dd 或 yyyy-MM-dd HH:mm:ss
     * @param lastDayOfMonth 格式为 yyyy-MM-dd 或 yyyy-MM-dd HH:mm:ss
     * @return
     */
    public List<PhysicalPurchaseJournal> findBySellerIdMonth(int sellerId, String firstDayOfMonth, String lastDayOfMonth) {
        SqlQuery query = new SqlQuery();
        query.from(getTableName()).where(Fields.SELLER_ID.eq("?"))
                .and(Fields.CREATED_DATE.ge("?")).and(Fields.CREATED_DATE.le("?"));
        return find(query.sql(), sellerId, firstDayOfMonth, lastDayOfMonth);
    }
}