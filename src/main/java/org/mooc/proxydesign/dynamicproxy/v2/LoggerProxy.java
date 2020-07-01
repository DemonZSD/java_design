package org.mooc.proxydesign.dynamicproxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author by Zhu Shidong
 */
public class LoggerProxy implements InvocationHandler {
    private Object target;

    public LoggerProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("This is before method invoking log");
        Object returnVAL = method.invoke(target, args);
        System.out.println("This is after method invoking log");
        return returnVAL;
    }
}
