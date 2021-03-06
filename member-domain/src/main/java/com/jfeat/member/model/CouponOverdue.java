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
package com.jfeat.member.model;

import com.jfeat.identity.model.User;
import com.jfeat.member.model.base.CouponOverdueBase;
import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfinal.plugin.activerecord.Db;

import java.util.List;

@TableBind(tableName = "t_coupon_overdue")
public class CouponOverdue extends CouponOverdueBase<CouponOverdue> {

    /**
     * Only use for query.
     */
    public static CouponOverdue dao = new CouponOverdue();

    public List<CouponOverdue> findByUserId(Integer userId) {
        return findByField(Fields.USER_ID.toString(), userId);
    }

    public User getUser() {
        return User.dao.findById(getUserId());
    }

    public List<CouponOverdue> findByCouponId(Integer couponId) {
        return findByField(Fields.COUPON_ID.toString(), couponId);
    }

    public Coupon getCoupon() {
        return Coupon.dao.findById(getCouponId());
    }

    //找出 有将要过期优惠券的用户
    public List<Integer> findWillOverdue(String dateTime) {
        String sql = "select user_id from t_coupon_overdue" +
                " where end_time<=?" +
                " group by user_id";
        return Db.query(sql, dateTime);
    }

    public void deleteWillOverdue(String dateTime) {
        Db.update("delete from t_coupon_overdue where end_time<=?", dateTime);
    }
}
