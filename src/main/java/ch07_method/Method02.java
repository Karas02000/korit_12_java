package ch07_method;

import java.util.Scanner;

public class Method02 {

    static void ever(int num, double score){
        double result = score / num;
        System.out.println("합계 : " + score);
        System.out.println("평균 : " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까 >>> ");
        int score_num = sc.nextInt();
        System.out.println();

        for(int i=1 ; i<=score_num ; i++){
            System.out.print(i+". 과목의 점수를 입력하세요 >>> ");
            sum += sc.nextDouble();
        }

        ever(score_num, sum);

    }
}
