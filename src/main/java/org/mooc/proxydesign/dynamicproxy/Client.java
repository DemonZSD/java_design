package org.mooc.proxydesign.dynamicproxy;

public class Client {


    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxy = (ITeacherDao) proxyFactory.getProxyInstance();
//        System.out.println(proxy.getClass());
        System.out.println(proxy.teach());
        System.out.println(proxy.goclass());
    }


}
