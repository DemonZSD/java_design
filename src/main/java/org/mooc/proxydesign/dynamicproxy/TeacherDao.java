package org.mooc.proxydesign.dynamicproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public String teach() {
        System.out.println("invoke method");
        return "teacher teaching";
    }

    @Override
    public String goclass() {
        return "now lets go class";
    }


}
