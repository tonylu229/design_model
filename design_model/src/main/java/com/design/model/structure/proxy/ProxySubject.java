/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.structure.proxy;

/**
 * @author luqm
 * @version ProxySubject, v0.1 2019/10/11 16:24
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    public void doWork() {
        turnOnComputer();
        subject.doWork();
        turnOffComputer();
    }

    private void turnOnComputer(){
        System.out.println("打开电脑。。。");
    }

    private void turnOffComputer(){
        System.out.println("关闭电脑。。。");
    }
}
