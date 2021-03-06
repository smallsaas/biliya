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

package com.jfeat.wechat.notification;

import com.jfeat.wechat.service.WechatTemplateMessageService;

import java.util.Map;

/**
 * Created by jackyhuang on 17/2/14.
 */
public class NotificationTask implements Runnable {

    private String openid;
    private String messageTypeName;
    private Map<String, String> params;
    private String url;

    public NotificationTask(String openid, String messageTypeName, Map<String, String> params, String url) {
        this.openid = openid;
        this.messageTypeName = messageTypeName;
        this.params = params;
        this.url = url;
    }

    private WechatTemplateMessageService templateMessageService = new WechatTemplateMessageService();

    public void run() {
        try {
            templateMessageService.send(openid, messageTypeName, params, url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

