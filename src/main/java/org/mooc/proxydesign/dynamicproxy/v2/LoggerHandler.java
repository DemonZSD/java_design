package org.mooc.proxydesign.dynamicproxy.v2;

import org.mooc.common.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * LoggerHandler is for logging info when a method witch interesting be invoked
 *
 * @author by Zhu Shidong
 */
public class LoggerHandler implements InvocationHandler {
    private Object target;

    public LoggerHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnVAL = method.invoke(target, args);
        LogUtils.Info(String.format("method: %s invoked", method.getName()));
        return returnVAL;
    }
}
