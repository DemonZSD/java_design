package org.mooc.adapterpattern.object_adapter;

/**
 * Adaptor class witch implements Target interface.
 *
 * @author by Zhu Shidong
 */
public class Adaptor implements Target{
    private Adaptee adaptee;
    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void target1() {
        // 委派
        this.adaptee.target1();
    }

    @Override
    public void target2() {
        System.out.println("This is Adapter -> target2 implements");
    }

}
