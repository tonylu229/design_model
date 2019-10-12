/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.structure.bridge;

/**
 * 桥接模式通常适用于以下场景。
 * 当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时。
 * 当一个系统不希望使用继承或因为多层次继承导致系统类的个数急剧增加时。
 * 当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时。
 *
 * @author luqm
 * @version MainClass, v0.1 2019/10/11 15:33
 */
public class MainClass {

    public static void main(String[] args) {
        Color yellow = new Yellow();
        Color green = new Green();

        Wallet wallet = new Wallet(yellow);
        HandBag handBag = new HandBag(green);

        System.out.println(wallet.showMyBag());
        System.out.println(handBag.showMyBag());
    }
}
