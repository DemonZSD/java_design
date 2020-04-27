package org.mooc.adapterpattern.class_adapter;

/**
 * 1. 必须实现 Target
 * 2. 必须继承 Adaptee
 *
 * @author by Zhu Shidong
 */
public class Adaptor extends Adaptee implements Target {
    public void target2() {
        System.out.println("This is the Adaptor -> target2 implements");
    }
}
