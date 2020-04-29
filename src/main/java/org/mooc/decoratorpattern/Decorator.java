package org.mooc.decoratorpattern;

/**
 * 装饰器角色
 *
 * @author by Zhu Shidong
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        // 委派给构建
        component.doSomething();
    }
}
