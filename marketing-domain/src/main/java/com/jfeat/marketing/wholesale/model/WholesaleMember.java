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
package com.jfeat.marketing.wholesale.model;

import com.google.common.collect.Lists;
import com.jfeat.identity.model.User;
import com.jfeat.marketing.wholesale.model.base.WholesaleMemberBase;
import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Page;

import java.util.List;

@TableBind(tableName = "t_wholesale_member")
public class WholesaleMember extends WholesaleMemberBase<WholesaleMember> {

    /**
     * Only use for query.
     */
    public static WholesaleMember dao = new WholesaleMember();

    public enum Status {
        UNPAID,
        PAID,
        REFUND
    }

    @Override
    public boolean save() {
        setStatus(Status.UNPAID.toString());
        return super.save();
    }

    public List<WholesaleMember> findByUserId(Integer userId) {
        return findByField(Fields.USER_ID.toString(), userId);
    }

    public User getUser() {
        return User.dao.findById(getUserId());
    }

    public List<WholesaleMember> findByWholesaleId(Integer wholesaleId) {
        return findByField(Fields.WHOLESALE_ID.toString(), wholesaleId);
    }

    public Wholesale getWholesale() {
        return Wholesale.dao.findById(getWholesaleId());
    }

    public Page<WholesaleMember> paginate(Integer pageNumber, Integer pageSize, Integer wholesaleId, String status, String startTime, String endTime) {
        String sql = "select *";
        StringBuilder sqlExceptSelect = new StringBuilder(" from t_wholesale_member where 1=1");
        String cond = " and ";
        List<Object> params = Lists.newLinkedList();
        if (wholesaleId != null) {
            sqlExceptSelect.append(cond).append(Fields.WHOLESALE_ID.eq("?"));
            params.add(wholesaleId);
        }
        if (StrKit.notBlank(status)) {
            sqlExceptSelect.append(cond).append(WholesaleMember.Fields.STATUS.eq("?"));
            params.add(status);
        }
        if (StrKit.notBlank(startTime)) {
            sqlExceptSelect.append(cond).append(Fields.CREATED_TIME.ge("?"));
            params.add(startTime);
        }
        if (StrKit.notBlank(endTime)) {
            sqlExceptSelect.append(cond).append(WholesaleMember.Fields.CREATED_TIME.le("?"));
            params.add(endTime);
        }
        return paginate(pageNumber, pageSize, sql, sqlExceptSelect.toString(), params.toArray());
    }

    public List<WholesaleMember> findFirstByUserIdOrderNumberStatus(Integer userId, String orderNumber, String status) {
        String sql = "select * from t_wholesale_member where user_id=? and order_number=? and status=?";
        return find(sql, userId, orderNumber, status);
    }

}
