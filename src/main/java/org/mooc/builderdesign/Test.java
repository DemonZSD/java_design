package org.mooc.builderdesign;

public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();

        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse(
                "java",
                "javaPPT",
                "javaVide",
                "javaQA",
                "javaArticle");

        System.out.println(course.toString());
    }
}
