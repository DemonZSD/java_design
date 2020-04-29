package org.mooc.decoratorpattern;

/**
 * TODO
 *
 * @author by Zhu Shidong
 */
public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("This is concrete component.");
    }
}
