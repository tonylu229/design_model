/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.design.model.creative.prototype;

/**
 * 原型模式的意图是通过复制一个现有的对象来生成新的对象，而不是通过实例化的方式。
 *
 * 原型模式通常适用于以下场景。
 * 对象之间相同或相似，即只是个别的几个属性不同的时候。
 * 对象的创建过程比较麻烦，但复制比较简单的时候。
 *
 * @author luqm
 * @version MainClassA, v0.1 2019/10/11 9:52
 */
public class MainClassA {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation zhangsan = new Citation();
        zhangsan.setName("张三");
        zhangsan.setMsg("同学：在2016学年第一学期中表现优秀，被评为三好学生。");
        zhangsan.setSchool("华东理工大学");
        zhangsan.display();

        Citation lisi = (Citation)zhangsan.clone();
        lisi.setName("李四");
        lisi.display();
    }

    static class Citation implements Cloneable{

        private String name;

        private String msg;

        private String school;

        public void setName(String name) {
            this.name = name;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            System.out.println("start to clone...");
            return super.clone();
        }

        public void display(){
            System.out.println(name + msg + school);
        }
    }
}
