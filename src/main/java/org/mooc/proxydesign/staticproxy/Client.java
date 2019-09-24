package org.mooc.proxydesign.staticproxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();

        TeacherProxy proxy = new TeacherProxy(teacherDao);
        proxy.teach();
    }
}
