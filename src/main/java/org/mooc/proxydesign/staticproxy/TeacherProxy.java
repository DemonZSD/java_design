package org.mooc.proxydesign.staticproxy;
// 静态代理对象 要实现接口   note: 动态代理对象不需要实现接口
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
