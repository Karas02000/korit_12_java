package ch06_loops;

import java.util.Scanner;

public class Loop06NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=3 ; j++){
                System.out.println(i+"일차 "+j+"교시입니다.");
            }
            System.out.println();
        }

        for(int i=0 ; i<10 ; i++){
            for(int j=1 ; j<=10 ; j++){
                System.out.print(((i*10)+j) + "\t");
            }
            System.out.println();
        }

        System.out.print("1부터 몇까지 더하겠습니까? >> ");
        int num = sc.nextInt();
        int sum_Odd = 0;
        int sum_Even = 0;
        for(int i=1 ; i<=num ; i++){
            if(i%2==0){
                sum_Even += i;
            }else if(i%2==1){
                sum_Odd += i;
            }
        }
        System.out.println("짝수의 합 : " + sum_Even);
        System.out.println("홀수의 합 : " + sum_Odd);
    }
}
