package ch08_classes;

public class Student2Builder {
    private int studentCode;
    private String studentName;

    public Student2Builder setStudentCode(int studentCode) {
        this.studentCode = studentCode;
        return this;
    }

    public Student2Builder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public Student2 createStudent2() {
        return new Student2(studentCode);
    }
}