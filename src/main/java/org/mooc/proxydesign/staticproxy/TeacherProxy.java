package org.mooc.proxydesign.staticproxy;

public class TeacherProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("proxy start ...");
        target.teach();
        System.out.println("proxy end");
    }
}
