/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.builder;

import java.math.BigDecimal;

/**
 * @author luqm
 * @version Product, v0.1 2019/10/11 9:12
 */
public class Product {

    private String name;

    private BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void show(){
        System.out.println(getName() + " : " + getPrice());
    }
}
