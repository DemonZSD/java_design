package org.mooc.builderdesign;

public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);

    public abstract Course makeCourse();
}
