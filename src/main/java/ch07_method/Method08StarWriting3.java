package ch07_method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Method08StarWriting3 {

    public static String getStar(int row, int option){
        String result="";

        switch (option){
            case 1:
                for(int i=0 ; i<=row ; i++) {
                    for(int j=0 ; j<i ; j++){
                        result += "*";
                    }
                    result += "\n";
                }break;
            case 2:
                for(int i=row ; i>=0 ; i--) {
                    for(int j=0 ; j<i ; j++){
                        result += " ";
                    }
                    for(int j=0 ; j<row-i ; j++){
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for(int i=row ; i>0 ; i--) {
                    for(int j=0 ; j<i ; j++){
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 4:
                for(int i=0 ; i<=row ; i++) {
                    for(int j=0 ; j<i ; j++){
                        result += " ";
                    }
                    for(int j=0 ; j<row-i ; j++){
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            default:
                result = "불가능한 메뉴 선택입니다. 1 - 4의 정수만 입력해 주세요.";
        }

        return result;
    }

    public static void main(String[] args) {
        //사용할 객체 생성
        Scanner scanner = new Scanner(System.in);
        boolean continued = true;
        while(continued){

            int rowOfStars = 0; // 몇줄짜리를 만드는지
            int choice = 0; //증가하는는 별인지 감소하는 별인지
            String starResult = "";


            try {
                System.out.println("1. 왼쪽으로 치우친 증가하는 별");
                System.out.println("2. 오른쪽으로 치우친 증가하는 별");
                System.out.println("3. 왼쪽으로 치우친 감소하는 별");
                System.out.println("4. 오른쪽으로 치우친 감소하는 별");
                System.out.print("어떤 식으로 별을 찍으시겠습니까? : ");
                choice = scanner.nextInt();
                scanner.nextLine();
                System.out.print("몇 줄로 별을 찍으시겠습니까? : ");
                rowOfStars = scanner.nextInt();
                scanner.nextLine();

                starResult = getStar(rowOfStars, choice);
            }catch (InputMismatchException e){
                System.out.println("잘못된 입력입니다.");

            }

        /*
        이상의 32번 라인에 함축되어있는 의미를 파악할 필요가 있습니다.
            1. getStar()라고 하는 정적 메서드가 있다는 점
            2. getStar()메서드는 매개변수가 있고, return 타입이 있는 call4() 유형이라는 점.
                - () 내에 변수명이 들어가있다는 점에서, 그 변수의 자료형까지 고려하면
                - int 타입의 변수가 두 개 요구된다는 점을 파악할 수 있다.
         */

            System.out.println(starResult);

            {
                System.out.print("계속하시겠습니까?(Yes이면 1, No이면 0을 선택하세요.) : ");

                try{
                    int answer = scanner.nextInt();
                    scanner.nextLine();
                    switch (answer) {
                        case 1:
                            break;
                        case 0:
                            continued = !continued;
                            break;
                        default:
                            System.out.println("불가능한 선택입니다. 0과 1중에 선택해주세요.");
                            continued = !continued;
                    }
                }catch (Exception e) {
                    System.out.println("올바르지 않은 입력입니다.");
                    continued = !continued;
                }
            }
        }
    }
}
