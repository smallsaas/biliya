/*
 * Copyright (C) 2014-2017 www.kequandian.net
 *
 *  The program may be used and/or copied only with the written permission
 *  from kequandian.net, or in accordance with the terms and
 *  conditions stipulated in the agreement/contract under which the program
 *  has been supplied.
 *
 *  All rights reserved.
 */
package com.jfeat.common;

import com.jfeat.core.JFeatConfig;

public class MerchantApplicationJFeatConfig extends JFeatConfig {

    public MerchantApplicationJFeatConfig() {
        new MerchantApplicationModule(this);
    }

}
