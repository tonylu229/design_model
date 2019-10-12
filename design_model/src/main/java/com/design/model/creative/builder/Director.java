/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.builder;

/**
 * 指挥者，用于指定构建方式创建产品
 *
 * @author luqm
 * @version Director, v0.1 2019/10/11 9:28
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product create(){
        builder.builderName();
        builder.builderPrice();
        return builder.getResult();
    }
}
