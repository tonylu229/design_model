/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.abstractfactory;

/**
 * 戴尔组装机工厂类
 *
 * @author luqm
 * @version AssembleComputeFactoryDell, v0.1 2019/10/14 15:58
 */
public class AssembleComputeFactoryDell implements AssembleComputeFactory {

    public MainEngine getMainEngine() {
        MainEngine dellMainEngine = new MainEngine();
        dellMainEngine.setBrand("DELL");
        dellMainEngine.setCpu("Inter Core i7");
        return dellMainEngine;
    }

    public Display getDisplay() {
        Display dellDisplay = new Display();
        dellDisplay.setBrand("DELL");
        return dellDisplay;
    }
}
