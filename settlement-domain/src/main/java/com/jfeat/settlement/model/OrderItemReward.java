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
package com.jfeat.settlement.model;

import com.jfeat.settlement.model.base.OrderItemRewardBase;
import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@TableBind(tableName = "t_order_item_reward")
public class OrderItemReward extends OrderItemRewardBase<OrderItemReward> {

    /**
     * Only use for query.
     */
    public static OrderItemReward dao = new OrderItemReward();

    public enum State {
        PENDING_SETTLEMENT,
        SETTLED,
        REFUNDED
    }

    public enum Type {
        SELLER,
        AGENT,
        PLATFORM,
        PARTNER,
        SELF,
        CROWN,
        WHOLESALE,
        MERCHANT,
        COPARTNER
    }

    public List<OrderItemReward> findByOrderId(int orderId) {
        return find("select * from t_order_item_reward where order_id=?", orderId);
    }

    public int deleteByOrderId(int orderId) {
        return Db.update("delete from t_order_item_reward where order_id=?", orderId);
    }

    public BigDecimal queryTotalReward(int id) {
        List<Object> params = new ArrayList<>();
        String select = "select sum(reward) from t_order_item_reward where owner_id=? and (state=? or state=?)";
        params.add(id);
        params.add(State.PENDING_SETTLEMENT.toString());
        params.add(State.SETTLED.toString());
        BigDecimal result = Db.queryBigDecimal(select, params.toArray());
        return result != null ? result : new BigDecimal(0);
    }

    public BigDecimal queryRewardByState(int id, State... states) {
        List<Object> params = new ArrayList<>();
        StringBuilder builder = new StringBuilder("select sum(reward) from t_order_item_reward where owner_id=? and ( ");
        params.add(id);
        String cond = "";
        for (State state : states) {
            builder.append(cond);
            builder.append("state=?");
            params.add(state.toString());
            cond = " or ";
        }
        builder.append(" ) ");
        BigDecimal result = Db.queryBigDecimal(builder.toString(), params.toArray());
        return result != null ? result : new BigDecimal(0);
    }

    public BigDecimal queryRewardByTime(int id, String startDate, String endDate, State state) {
        List<Object> params = new ArrayList<>();
        StringBuilder builder = new StringBuilder("select sum(reward) from t_order_item_reward where owner_id=?");
        params.add(id);
        builder.append(" and created_time between ?");
        params.add(startDate);
        builder.append(" and ?");
        params.add(endDate);
        builder.append(" and state=?");
        params.add(state.toString());
        BigDecimal result = Db.queryBigDecimal(builder.toString(), params.toArray());
        return result != null ? result : new BigDecimal(0);
    }

    public Long queryOrdersByTime(int id, String startDate, String endDate, State state) {
        List<Object> params = new ArrayList<>();
        StringBuilder builder = new StringBuilder("select count(DISTINCT order_id) from t_order_item_reward where owner_id=?");
        params.add(id);
        builder.append(" and created_time between ?");
        params.add(startDate);
        builder.append(" and ?");
        params.add(endDate);
        builder.append(" and state=?");
        params.add(state.toString());
        Long result = Db.queryLong(builder.toString(), params.toArray());
        return result;
    }

    public List<OrderItemReward> find(Integer ownerId, String startDate, String endDate, String state, String type, String orderNumber) {
        StringBuilder sql = new StringBuilder("select oir.*, u.name, " +
                "o.order_number, o.total_price as order_total_price, o.created_date as order_created_time, o.pay_date as order_paid_time, " +
                "oi.cover, oi.product_name, oi.quantity as product_quantity, oi.price as product_price " +
                "from t_order_item_reward oir " +
                "join t_order o on o.id=oir.order_id join t_order_item oi on oi.id=oir.order_item_id " +
                "join t_user u on oir.owner_id=u.id");
        List<Object> params = new ArrayList<>();
        sql.append(" where oir.created_time between ?");
        params.add(startDate);
        sql.append(" and ?");
        params.add(endDate);
        if (ownerId != null) {
            sql.append(" and oir.owner_id=?");
            params.add(ownerId);
        }
        if (StrKit.notBlank(state)) {
            sql.append(" and oir.state=?");
            params.add(state);
        }
        if (StrKit.notBlank(type)) {
            sql.append(" and oir.type=?");
            params.add(type);
        }
        if (StrKit.notBlank(orderNumber)) {
            sql.append(" and o.order_number=?");
            params.add(orderNumber);
        }

        sql.append(" order by oir.id desc");
        return find(sql.toString(), params.toArray());
    }

    public Page<OrderItemReward> paginate(int pageNumber, int pageSize,
                                          Integer ownerId, String userName,
                                          String startDate, String endDate, String state, String type, String orderNumber) {
        StringBuilder select = new StringBuilder("select oir.*, u.name, " +
                "oi.cover, oi.product_name, oi.quantity as product_quantity, oi.price as product_price ");
        StringBuilder query = new StringBuilder("from t_order_item_reward oir " +
                "left join t_order_item oi on oi.id=oir.order_item_id " +
                "join t_user u on oir.owner_id=u.id");
        List<Object> params = new ArrayList<>();
        query.append(" where oir.created_time between ?");
        params.add(startDate);
        query.append(" and ?");
        params.add(endDate);

        if (ownerId != null && StrKit.notBlank(userName)) {
            query.append(" and (oir.owner_id=? or u.name like ?) ");
            params.add(ownerId);
            params.add(userName + "%");
        }
        if (ownerId == null && StrKit.notBlank(userName)) {
            query.append(" and u.name like ? ");
            params.add(userName + "%");
        }
        if (ownerId != null && StrKit.isBlank(userName)) {
            query.append(" and oir.owner_id=? ");
            params.add(ownerId);
        }

        if (StrKit.notBlank(state)) {
            query.append(" and oir.state=?");
            params.add(state);
        }
        if (StrKit.notBlank(type)) {
            query.append(" and oir.type=?");
            params.add(type);
        }
        if (StrKit.notBlank(orderNumber)) {
            query.append(" and oir.order_number=?");
            params.add(orderNumber);
        }

        query.append(" order by oir.id desc");
        return this.paginate(pageNumber, pageSize, select.toString(), query.toString(), params.toArray());
    }


    public boolean save() {
        setState(State.PENDING_SETTLEMENT.toString());
        setCreatedTime(new Date());
        return super.save();
    }
}
