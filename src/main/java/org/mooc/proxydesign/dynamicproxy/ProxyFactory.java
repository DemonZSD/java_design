package org.mooc.proxydesign.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory  {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成一个代理对象
    public Object getProxyInstance(){
        // classloader: 当前目标对象使用的类加载器  获取加载器的方法固定
        // class<T> interface : 目标类实现的接口类型，使用泛型确认类型
        // handler : 事件处理，执行目标对象的方法时，会去触发事件处理器的方法，
        //           会把当前执行的目标对象的方法作为参数进行处理
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("jdk 代理开始");
                    // 通过反射机制 调用目标对象的方法
                    Object returnVAL = method.invoke(target, args);
                    System.out.println("JDK 代理结束");
                    return returnVAL;
                });
        /*
        new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk 代理开始");
                // 通过反射机制 调用目标对象的方法
                return method.invoke(target, args);
            }
        }
         */
    }

}
