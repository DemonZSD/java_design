package org.mooc.proxydesign.dynamicproxy.v2;

/**
 * TODO
 *
 * @author by Zhu Shidong
 */
public class ClientV2 {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        GeneralProxyFactory proxyFactory = new GeneralProxyFactory(teacherDao);
        ITeacherDao proxy = (ITeacherDao)proxyFactory.getProxyInstance(new LoggerProxy(teacherDao));
        proxy.teach();

    }
}
