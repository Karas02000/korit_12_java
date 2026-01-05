package ch11_arrays;

import java.util.Scanner;

public class Array03Method {
    Scanner sc = new Scanner(System.in);
    int len;
    double sum = 0;
    String[] humans;
    double[] scores;

    public Array03Method(){
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        this.len = sc.nextInt();
        sc.nextLine();
        this.humans = new String[len];
        this.scores = new double[len];
    }

    public void getName() {
        for (int i = 0; i < humans.length; i++) {
            System.out.print(i + 1 + " 번 학생의 이름을 등록하세요 >>> ");
            humans[i] = sc.nextLine();
        }
    }

    public void getScore(){
        for (int i = 0; i < humans.length; i++) {
            System.out.print(humans[i] + " 학생의 점수를 입력하세요 >>> ");
            scores[i] = sc.nextDouble();
            this.sum += scores[i];
            sc.nextLine();
        }
    }

    public void printResult(){
        System.out.println("학생들의 점수 총합은 " + this.sum + "점 입니다.");
    }

    public void writeNameAndScore() {
        getName();
        getScore();
        printResult();
    }
}
