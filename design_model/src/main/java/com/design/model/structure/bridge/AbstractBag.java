/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.structure.bridge;

/**
 * @author luqm
 * @version AbstractBag, v0.1 2019/10/11 15:20
 */
public abstract class AbstractBag {

    /**
     * 作为包的一个属性，且改属性扩展性会很强。
     */
    protected  Color color;

    public AbstractBag(Color color) {
        this.color = color;
    }

    public abstract String showMyBag();
}
