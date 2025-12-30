package ch08_classes;

public class Student {
    int studentCode;
    String studentName;
    double score;

    public Student(){
        System.out.println("기본생성자로 객체를 생성했습니다.");
    }

    public Student(int studentCode){
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
    }

    public Student(String studentName){
        System.out.println("String 매개변수 생성자로 객체를  생성했습니다.");
        this.studentName = studentName;
    }

    public Student(int studentCode, String studentName){
        System.out.println("int, String 매개변수 생성자로 객체를  생성했습니다.");
        this.studentCode = studentCode;
        this.studentName = studentName;
    }

    public Student(int studentCode, String studentName, double score){
        System.out.println("int, String, double 매개변수 생성자로 객체를  생성했습니다.");
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.score = score;
    }

    public void showInfo(){
        System.out.println(studentName + " 학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + studentName);
        System.out.println("점수 : " + score);
    }
}
