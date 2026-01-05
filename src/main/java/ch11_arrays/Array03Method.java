package ch11_arrays;

import java.util.Scanner;

public class Array03Method {
    Scanner sc = new Scanner(System.in);
    int len;
    double sum = 0;
    String[] humans;
    double[] scores;

    public Array03Method(){ // 기본 생성자에 기능 추가
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        this.len = sc.nextInt(); // 배열의 길이가 될 정수형 변수 입력
        sc.nextLine(); //줄바꿈 대처
        this.humans = new String[len]; // 이름 배열 크기 초기화
        this.scores = new double[len]; // 점수 배열 크기 초기화
    }

    public void getName() { // 이름을 입력받는 반복문 메서드
        for (int i = 0; i < humans.length; i++) {
            System.out.print(i + 1 + " 번 학생의 이름을 등록하세요 >>> ");
            humans[i] = sc.nextLine();
        }
    }

    public void getScore(){ // 점수를 입력받는 반복문 메서드
        for (int i = 0; i < humans.length; i++) {
            System.out.print(humans[i] + " 학생의 점수를 입력하세요 >>> ");
            scores[i] = sc.nextDouble();
            this.sum += scores[i];
            sc.nextLine();
        }
    }

    public void printResult(){ // 결과 출력
        System.out.println("학생들의 점수 총합은 " + this.sum + "점 입니다.");
    }

    public void writeNameAndScore() { // 메서드 호출을 하려고 할때, 정리된 기능을 순서대로 호출하기 위한 메서드
        getName();
        getScore();
        printResult();
    }
}
