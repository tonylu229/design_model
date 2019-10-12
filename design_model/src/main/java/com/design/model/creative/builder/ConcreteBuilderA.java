/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.builder;

import java.math.BigDecimal;

/**
 * @author luqm
 * @version ConcreteBuilderA, v0.1 2019/10/11 9:17
 */
public class ConcreteBuilderA extends Builder {

    @Override
    public void builderName() {
        product.setName("ConcreteBuilderA Name");
    }

    @Override
    public void builderPrice() {
        product.setPrice(new BigDecimal(100));
    }
}
