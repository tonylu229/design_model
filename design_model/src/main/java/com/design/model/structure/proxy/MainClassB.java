/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.structure.proxy;

import java.lang.reflect.Proxy;

/**
 * @author luqm
 * @version MainClassB, v0.1 2019/10/11 16:40
 */
public class MainClassB {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), invocationHandler);
        proxy.doWork();
    }
}
