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
package com.jfeat.api;

import com.jfeat.product.model.Product;
import com.jfeat.product.model.ProductCategory;
import com.jfinal.ext.kit.RandomKit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ProductApiTest extends ApiTestBase {
    private String url = baseUrl + "rest/product";

    private List<Product> products = new LinkedList<>();

    @Before
    public void setup() throws IOException {
        ProductCategory category = new ProductCategory();
        category.setName("category 1");
        category.save();

        for (int i = 1; i <= 10; i++) {
            Product product = new Product();
            product.setStatus(Product.Status.ONSELL.toString());
            product.setName("product " + i);
            product.setShortName("product" + i);
            product.setCategoryId(category.getId());
            product.setPrice(new BigDecimal("34.00"));
            if (i % 2 == 0) {
                product.setPromoted(Product.Promoted.YES.getValue());
            }
            if (i % 3 == 0) {
                product.setStatus(Product.Status.DRAFT.toString());
            }
            product.save();
            for (int j = 0; j < 2; j++) {
                product.addImage("http://localhost:8080/images/" + RandomKit.randomStr() + ".jpg");
            }
            products.add(product);
        }
    }

    @After
    public void clean() {
        for(Product product : Product.dao.findAll()) {
            product.delete();
        }
        for(ProductCategory category : ProductCategory.dao.findAll()) {
            category.delete();
        }
    }

    @Test
    public void testIndex() throws IOException {
        Response response = get(url, Response.class);
        assertEquals(SUCCESS, response.getStatusCode());
    }

    @Test
    public void testShow() throws IOException {
        Response response = get(url + "/" + products.get(0).getId(), Response.class);
        assertEquals(SUCCESS, response.getStatusCode());
    }

    @Test
    public void testShowInvalidId() throws IOException {
        Response response = get(url + "/999999", Response.class);
        assertEquals(FAILURE, response.getStatusCode());
    }

    @Test
    public void testShowInvalidStatus() throws IOException {
        Response response = get(url + "/" + products.get(2).getId(), Response.class);
        assertEquals(FAILURE, response.getStatusCode());
    }
}