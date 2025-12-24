package ch06_loops;

import java.util.Scanner;

public class Loop08Star3 {
    public static void main(String[] args) {
        for(int i=0 ; i<=5 ; i++){
            for(int j=0 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j=5 ; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=5 ; i>=0 ; i--){
            for(int j=0 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j=5 ; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("몇개의 별을 그릴까요? >> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0 ; i<=n ; i++){
            for(int j=0 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j=n ; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=n ; i>=0 ; i--){
            for(int j=0 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j=n ; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
