package org.mooc.adapterpattern.object_adapter;

/**
 * TODO
 *
 * @author by Zhu Shidong
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target t = new Adaptor(adaptee);
        t.target1();
        t.target2();
    }
}
