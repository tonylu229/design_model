/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.abstractfactory;

/**
 * @author luqm
 * @version AssembleComputeFactoryLenovo, v0.1 2019/10/14 16:00
 */
public class AssembleComputeFactoryLenovo implements AssembleComputeFactory {

    public MainEngine getMainEngine() {
        MainEngine lenovoMainEngine = new MainEngine();
        lenovoMainEngine.setBrand("LENOVO");
        lenovoMainEngine.setCpu("Inter Core i9");
        return lenovoMainEngine;
    }

    public Display getDisplay() {
        Display lenovoDisplay = new Display();
        lenovoDisplay.setBrand("LENOVO");
        return lenovoDisplay;
    }
}
