package ch15_objects.teachers;

import java.lang.reflect.Method;

public class TeacherMain {

    public static void main(String[] args) {
        Method[] methods = TeacherMain.class.getDeclaredMethods();
        Teacher teacher1 = new Teacher("안근수","코리아IT아카데미");
        Teacher teacher2 = new Teacher("안근수", "코리아IT아카데미");

        System.out.println(methods[0].getName());
        System.out.println(methods[1].getName());

    }
}
