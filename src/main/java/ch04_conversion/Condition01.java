package ch04_conversion;

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





        int point = sc.nextInt();
        int VIP_point = 80;
        int GOLD_point = 60;
        int SILVER_point = 40;
        int BRONZE_point = 20;

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
            user_grade = "NOMAL";
        }
        System.out.println("유저등급 : "+user_grade);
    }
}
