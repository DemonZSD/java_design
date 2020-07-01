package org.mooc.proxydesign.dynamicproxy.v2;

public class TeacherDao implements ITeacherDao {
    @Override
    public String teach() {
        System.out.println("invoke method v2");
        return "teacher teaching v2";
    }
}
