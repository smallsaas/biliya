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

import com.google.common.collect.Lists;
import com.jfeat.identity.model.User;
import com.jfeat.kit.SqlQuery;
import com.jfeat.settlement.model.base.RewardCashBase;
import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@TableBind(tableName = "t_reward_cash")
public class RewardCash extends RewardCashBase<RewardCash> {

    /**
     * Only use for query.
     */
    public static RewardCash dao = new RewardCash();

    public enum Status {
        APPLYING,
        REJECTED,
        HANDLING,
        COMPLETED
    }

    public boolean save() {
        setApplyTime(new Date());
        setStatus(Status.APPLYING.toString());
        return super.save();
    }

    /**
     * 查询正在申请提现的记录数
     * @return
     */
    public long countApplying() {
        return Db.queryNumber("select count(*) from t_reward_cash where status=?", Status.APPLYING.toString()).longValue();
    }

    /**
     * 查询某用户正在申请提现的记录数
     * @return
     */
    public long countApplying(int userId) {
        return Db.queryNumber("select count(*) from t_reward_cash where owner_id = ? and (status = ? or status = ?)",
                userId, Status.APPLYING.toString(), Status.HANDLING.toString()).longValue();
    }

    public User getUser() {
        return User.dao.findById(getOwnerId());
    }

    public Page<RewardCash> queryRewardHistorical(int pageNumber, int pageSize, String startDate, String endDate, Integer id, String userName, String status){
        List<Object> params = Lists.newArrayList();
        StringBuilder select = new StringBuilder("select c.*, u.name");
        StringBuilder query = new StringBuilder();
        query.append("from ");
        query.append(this.getTableName());
        query.append(" as c ");
        query.append("join t_user as u on c.owner_id=u.id ");
        query.append("where c.apply_time between ?");
        params.add(startDate);
        query.append(" and ?");
        params.add(endDate);
        String cond = " and ";
        if(id != null) {
            query.append(cond);
            query.append("c.owner_id=?");
            params.add(id);
        }
        if (StrKit.notBlank(userName)) {
            query.append(cond);
            query.append(" u.name like ? ");
            params.add(userName+"%");
        }
        if (StrKit.notBlank(status)) {
            query.append(cond);
            query.append("c.status=?");
            params.add(status);
        }
        query.append(" order by c.id desc");
        return this.paginate(pageNumber, pageSize, select.toString(), query.toString(), params.toArray());
    }

}