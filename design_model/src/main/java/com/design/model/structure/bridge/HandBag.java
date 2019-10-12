/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.structure.bridge;

/**
 * @author luqm
 * @version HandBag, v0.1 2019/10/11 15:32
 */
public class HandBag extends AbstractBag {

    public HandBag(Color color) {
        super(color);
    }

    @Override
    public String showMyBag() {
        return color.showColor() + " HandBag";
    }
}
