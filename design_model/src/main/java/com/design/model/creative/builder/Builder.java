/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.builder;

/**
 * @author luqm
 * @version Builder, v0.1 2019/10/11 9:14
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void builderName();
    public abstract void builderPrice();

    public Product getResult(){
        return product;
    }
}
