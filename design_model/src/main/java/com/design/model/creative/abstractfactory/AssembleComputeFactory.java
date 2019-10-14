/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.abstractfactory;

/**
 * 组装机抽象工厂接口，产品族有：主机和显示器
 * <p>
 * 抽象工厂模式的扩展有一定的“开闭原则”倾斜性：
 * 当增加一个新的产品族时只需增加一个新的具体工厂，不需要修改原代码，满足开闭原则。
 * 当产品族中需要增加一个新种类的产品时，则所有的工厂类都需要进行修改，不满足开闭原则。
 *
 * @author luqm
 * @version AssembleComputeFactory, v0.1 2019/10/14 15:51
 */
public interface AssembleComputeFactory {
    /**
     * 获取一个主机
     *
     * @return 主机
     */
    MainEngine getMainEngine();

    /**
     * 获取一个显示器
     *
     * @return 显示器
     */
    Display getDisplay();
}
