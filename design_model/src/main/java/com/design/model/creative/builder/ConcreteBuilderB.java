/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.builder;

import java.math.BigDecimal;

/**
 * @author luqm
 * @version ConcreteBuilderB, v0.1 2019/10/11 9:20
 */
public class ConcreteBuilderB extends Builder {

    @Override
    public void builderName() {
        product.setName("ConcreteBuilderB Name");
    }

    @Override
    public void builderPrice() {
        product.setPrice(new BigDecimal(200));
    }
}
