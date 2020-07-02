package org.mooc.proxydesign.dynamicproxy.v2;

import java.util.Date;

public class TeacherDao implements ITeacherDao {

    @Override
    public String teach() {
        return "teacher teaching v2";
    }
}
