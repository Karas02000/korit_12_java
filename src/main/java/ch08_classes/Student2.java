package ch08_classes;

public class Student2 {
    int studentCode;
    String studentName;
    double score;
    public Student2(){

    }
    public Student2(int studentCode){
        this.studentCode = studentCode;
    }
    public Student2(String studentName){
        this.studentName = studentName;
    }
    public Student2(int studentCode, String studentName){
        this.studentCode = studentCode;
        this.studentName = studentName;
    }
}
