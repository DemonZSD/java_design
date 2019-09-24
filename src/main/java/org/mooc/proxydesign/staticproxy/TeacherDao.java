package org.mooc.proxydesign.staticproxy;

public class TeacherDao implements ITeacherDao{

    @Override
    public void teach(){
        System.out.println("teacher teaching");
    }

}
