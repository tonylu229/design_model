/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.builder;

/**
 * 建造者（Builder）模式创建的是复杂对象，其产品的各个部分经常面临着剧烈的变化，但将它们组合在一起的算法却相对稳定，所以它通常在以下场合使用。
 * 创建的对象较复杂，由多个部件构成，各部件面临着复杂的变化，但构件间的建造顺序是稳定的。
 * 创建复杂对象的算法独立于该对象的组成部分以及它们的装配方式，即产品的构建过程和最终的表示是独立的。
 *
 * @author luqm
 * @version MainClass, v0.1 2019/10/11 9:30
 */
public class MainClass {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilderA();

        Director director = new Director(builder);
        Product product = director.create();
        product.show();

        builder = new ConcreteBuilderB();
        director = new Director(builder);
        product = director.create();
        product.show();
    }
}
