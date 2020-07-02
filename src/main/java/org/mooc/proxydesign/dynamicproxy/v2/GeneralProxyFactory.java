package org.mooc.proxydesign.dynamicproxy.v2;

import org.omg.CORBA.ObjectHelper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * GeneralProxyFactory a proxy factory class for creating Proxy target object
 * such as:
 * {@code GeneralProxyFactory proxyFactory = new GeneralProxyFactory(teacherDao)}
 * @author by Zhu Shidong
 */
public class GeneralProxyFactory {

    public static Object getProxyInstance(Class target, InvocationHandler handler){
        return Proxy.newProxyInstance(target.getClassLoader(),
                target.getInterfaces(), handler);
    }
}
