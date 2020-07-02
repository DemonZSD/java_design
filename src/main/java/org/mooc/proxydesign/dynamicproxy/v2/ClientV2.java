package org.mooc.proxydesign.dynamicproxy.v2;

import java.util.Date;

/**
 * TODO
 *
 * @author by Zhu Shidong
 */
public class ClientV2 {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        ITeacherDao proxy = (ITeacherDao)GeneralProxyFactory.getProxyInstance(
                TeacherDao.class, new LoggerHandler(teacherDao));
        System.out.println(proxy.teach());
    }
}
