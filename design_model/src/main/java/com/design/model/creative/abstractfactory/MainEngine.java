/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.abstractfactory;

/**
 * @author luqm
 * @version MainEngine, v0.1 2019/10/14 15:54
 */
public class MainEngine {

    private String brand;

    private String cpu;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "主机的品牌是：" + brand +
                ", cpu是" + cpu;
    }
}
