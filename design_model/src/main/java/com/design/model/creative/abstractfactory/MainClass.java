/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.abstractfactory;

/**
 * @author luqm
 * @version MainClass, v0.1 2019/10/14 16:02
 */
public class MainClass {
    public static void main(String[] args) {
        // 想来一台戴尔的组装机
        AssembleComputeFactory assembleComputeFactoryDell = new AssembleComputeFactoryDell();
        Display display = assembleComputeFactoryDell.getDisplay();
        MainEngine mainEngine = assembleComputeFactoryDell.getMainEngine();
        System.out.println(mainEngine.toString() + display.toString());

        // 想来一台联想的组装机
        AssembleComputeFactory assembleComputeFactoryLenovo = new AssembleComputeFactoryLenovo();
        display = assembleComputeFactoryLenovo.getDisplay();
        mainEngine = assembleComputeFactoryLenovo.getMainEngine();
        System.out.println(mainEngine.toString() + display.toString());

    }
}
