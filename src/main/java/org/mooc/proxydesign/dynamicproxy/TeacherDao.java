package org.mooc.proxydesign.dynamicproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("teacher teaching");
    }
}
