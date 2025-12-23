package ch05_condition;

import java.util.Scanner;

public class Condition08Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("연도를 입력하세요. >> ");
        year = sc.nextInt();

        if(year < 0) {
            System.out.println("입력이 올바르지 않습니다.");
        }else{
            if (year % 100 == 0) {
                if(year%400 == 0){
                    System.out.println(year+"년은 윤년입니다.");
                }else{
                    System.out.println(year+"년은 윤년이 아닙니다.");
                }
            } else {
                if(year%4 == 0){
                    System.out.println(year+"년은 윤년입니다.");
                }else{
                    System.out.println(year+"년은 윤년이 아닙니다.");
                }
            }
        }
    }
}
