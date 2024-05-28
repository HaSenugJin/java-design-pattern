package ex05;

import ex05.teacher.HtmlTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

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