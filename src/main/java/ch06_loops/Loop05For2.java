package ch06_loops;

import java.util.Scanner;

public class Loop05For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;

        for(int i=1 ; i<=100 ; i++){
            if(i%2 == 1){
                sum1+=i;
            }
        }

        System.out.println(sum1);

        int sum2 = 0;
        System.out.print("1부터 몇까지의 합을 구하시겠습니까? >> ");
        int num = sc.nextInt();

        for(int i=1 ; i<=num ; i++){
            sum2+=i;
        }

        System.out.println("1부터 " + num + "까지의 합은 " + sum2 + "입니다.");

    }
}
