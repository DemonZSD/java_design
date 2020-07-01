package org.mooc.decoratorpattern;

/**
 * Client class for doing something
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
