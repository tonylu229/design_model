/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author luqm
 * @version ProxyInvocationHandler, v0.1 2019/10/11 16:39
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Object object;

    public ProxyInvocationHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before ...");
        Object invoke = method.invoke(object, args);
        System.out.println("after ...");
        return invoke;
    }
}
