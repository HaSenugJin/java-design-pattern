package ex04;

import ex04.teacher.HtmlTeacher;
import ex04.teacher.JavaTeacher;
import ex04.teacher.PythonTeacher;
import ex04.teacher.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher jt = new JavaTeacher();
        Teacher pt = new PythonTeacher();
        Teacher ht = new HtmlTeacher();

        jt.수업하기();
        System.out.println();
        pt.수업하기();
        System.out.println();
        ht.수업하기();
    }
}