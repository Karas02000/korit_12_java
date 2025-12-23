package ch05_condition;

import java.util.Scanner;

/*
    중첩 if문
    - if문 안에 if문이 있을 수 있다.
 */
public class Condition07NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;
        String name;
        int A_score = 90;
        int B_score = 80;
        int C_score = 70;
        int D_score = 60;
        int max_score = 100;
        int min_score = 0;
        String grade="";

        System.out.print("점수를 입력하세요 >> ");
        score = sc.nextInt();
        sc.nextLine();

        System.out.print("이름을 입력하세요 >> ");
        name = sc.nextLine();



        if(min_score>score || max_score<score){
            System.out.println("잘못된 입력입니다.");
        }else {
            if (score >= A_score) {
                grade = "A";
            } else if (score >= B_score) {
                grade = "B";
            } else if (score >= C_score) {
                grade = "C";
            } else if (score >= D_score) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println(name+" 학생의 점수는 "+score+"점이고, 학점은 "+grade+"입니다.");
        }
    }
}
