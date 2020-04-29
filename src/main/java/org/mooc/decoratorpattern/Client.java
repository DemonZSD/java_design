package org.mooc.decoratorpattern;

/**
 * TODO
 *
 * @author by Zhu Shidong
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.doSomething();
    }
}
