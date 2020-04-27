package org.mooc.adapterpattern.class_adapter;

/**
 * This is the user of {@link Target } class.
 *
 * @author by Zhu Shidong
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adaptor();
        target.target1();
        target.target2();
    }
}
