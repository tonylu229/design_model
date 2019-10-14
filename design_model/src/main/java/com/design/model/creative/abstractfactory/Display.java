/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.abstractfactory;

/**
 * @author luqm
 * @version Display, v0.1 2019/10/14 15:56
 */
public class Display {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return " 显示器品牌是：" + brand ;
    }
}
