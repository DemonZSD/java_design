package org.mooc.decoratorpattern;

/**
 * 具体装饰
 *
 * @author by Zhu Shidong
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething(); // 拥有 ConcreteComponent 的功能
        // 自己的功能

    }
}
