package ch05_condition;

import java.util.Scanner;

public class Condition09Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        String result = "";


        System.out.print("연도를 입력하세요. >> ");
        year = sc.nextInt();

        boolean isLeapYear2 = (year % 4 == 0 && year % 100 != 0) || (year%400 == 0);

        if(year < 0) {
            result = "올바른 값이 아닙니다.";
        }else{
            result = (isLeapYear2) ? year+"년은 윤년입니다." : year+"년은 윤년이 아닙니다.";
        }
        System.out.println(result);
    }
}
