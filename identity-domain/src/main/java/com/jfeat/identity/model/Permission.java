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
package com.jfeat.identity.model;

import com.jfeat.identity.model.base.PermissionBase;
import com.jfeat.kit.SqlQuery;
import com.jfinal.ext.plugin.tablebind.TableBind;

import java.util.List;

@TableBind(tableName = "t_permission")
public class Permission extends PermissionBase<Permission> {

    /**
     * Only use for query.
     */
    public static Permission dao = new Permission();

    public void deleteByRoleId(int roleId) {
        deleteByField(Fields.ROLE_ID.toString(), roleId);
    }

    public List<Permission> findByRoleId(int roleId) {
        return findByField(Fields.ROLE_ID.toString(), roleId);
    }
}
