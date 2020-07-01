package org.mooc.proxydesign.dynamicproxy.v2;

import org.omg.CORBA.ObjectHelper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author by Zhu Shidong
 */
public class GeneralProxyFactory {
    private Object target;
    public GeneralProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxyInstance(InvocationHandler handler){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);
    }
}
