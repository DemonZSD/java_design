package org.mooc.proxydesign.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个target的代理对象
    public Object getProxyInstance(){
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    /**
     * 重写 intercept方法，会调用目标对象的方法
     */
    public Object intercept(Object obj0, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始代理模式：cglib");
        Object returnVAL = method.invoke(target, args);
        System.out.println("提交代理模式： cglib");
        return returnVAL;
    }
}
