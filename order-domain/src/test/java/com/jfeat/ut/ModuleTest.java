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
package com.jfeat.ut;

import com.jfeat.AbstractTestCase;
import com.jfeat.common.OrderDomainModule;
import com.jfeat.kit.DateKit;
import org.junit.Test;

public class ModuleTest extends AbstractTestCase {

    @Test
    public void test() {
        System.out.println(DateKit.hoursAgoStr(12, "yyyy-MM-dd HH:mm:ss"));
    }
}

