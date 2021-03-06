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
package com.jfeat.order.model;

import com.jfeat.order.model.base.OrderCustomerServiceItemBase;
import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfeat.order.model.OrderCustomerService;

import java.util.List;

@TableBind(tableName = "t_order_customer_service_item")
public class OrderCustomerServiceItem extends OrderCustomerServiceItemBase<OrderCustomerServiceItem> {

    /**
     * Only use for query.
     */
    public static OrderCustomerServiceItem dao = new OrderCustomerServiceItem();

    public enum Type {
        RETURN,
        EXCHANGE
    }

    public List<OrderCustomerServiceItem> findByOrderCustomerServiceId(Integer orderCustomerServiceId) {
        return findByField(Fields.ORDER_CUSTOMER_SERVICE_ID.toString(), orderCustomerServiceId);
    }

    public OrderCustomerService getOrderCustomerService() {
        return OrderCustomerService.dao.findById(getOrderCustomerServiceId());
    }

}
