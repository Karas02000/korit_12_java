package ch07_method;

import java.util.Scanner;

public class Method04ScoreCalc2 {
    public static double calcSum(){
        double sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 과목을 입력하시겠습니까? >>> ");
        int numOfSubs = sc.nextInt();
        for(int i=1 ; i<=numOfSubs ; i++){
            System.out.print(i + ". 과목의 점수를 입력하세요. >>> ");
            sum += sc.nextDouble();
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
