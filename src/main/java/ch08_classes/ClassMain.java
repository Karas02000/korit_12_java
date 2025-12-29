package ch08_classes;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        ClassA classA1 = new ClassA();
        ClassA classA2 = new ClassA();
        Scanner scanner = new Scanner(System.in);

        classA1.num = 1;
        classA1.name = "김일";
        classA1.score = 4.5;

        classA2.num = 100;
        classA2.name = "김이";
        classA2.score = 2;

        System.out.println(classA1.name + " 학생의 학번은 " + classA1.num + " 번이고, 점수는 " + classA1.score + " 점 입니다.");
        classA1.callName();

        System.out.println(classA2.name + " 학생의 학번은 " + classA2.num + " 번이고, 점수는 " + classA2.score + " 점 입니다.");
        classA2.name = "김삼";
        classA2.callName();
    }
}
