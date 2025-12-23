package ch05_condition;

import java.util.Scanner;

public class Condition11Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴를 선택해주세요.");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("메뉴 1을 선택하셨습니다."); break;
            case 2:
                System.out.println("메뉴 2을 선택하셨습니다."); break;
            case 3:
                System.out.println("메뉴 3을 선택하셨습니다."); break;
            case 4:
                System.out.println("메뉴 4을 선택하셨습니다."); break;
            case 5:
                System.out.println("메뉴 5을 선택하셨습니다."); break;
            case 6:
                System.out.println("메뉴 6을 선택하셨습니다."); break;
            default:
                System.out.println("올바르지 않은 메뉴입니다.");
        }
    }
}
