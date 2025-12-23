package ch05_condition;

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num2 = sc.nextInt();
//        sc.nextLine();
//        if(num2 > 0){
//            System.out.println("num2는 양수입니다.");
//        }
//        if(num2 < 15){
//            System.out.println("num2는 15 미만입니다.");
//        }





        int point;
        int VIP_point = 100;
        int GOLD_point = 80;
        int SILVER_point = 60;
        int BRONZE_point = 40;

        System.out.print("포인트를 입력하세요 >> ");
        point = sc.nextInt();

        String user_grade="";
        if(point >= VIP_point){
            user_grade = "VIP";
        }else if(point >= GOLD_point){
            user_grade = "GOLD";
        }else if(point >= SILVER_point){
            user_grade = "SILVER";
        }else if(point >= BRONZE_point){
            user_grade = "BRONZE";
        }else{
            user_grade = "GENERAL";
        }
        System.out.println("유저등급 : "+user_grade);
    }
}
