/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.structure.bridge;

/**
 * @author luqm
 * @version Wallet, v0.1 2019/10/11 15:32
 */
public class Wallet extends AbstractBag {

    public Wallet(Color color) {
        super(color);
    }

    @Override
    public String showMyBag() {
        return color.showColor() + " Wallet";
    }
}
