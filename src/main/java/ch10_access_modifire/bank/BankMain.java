package ch10_access_modifire.bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank account1 = new Bank("123456", "홍길동", 100000, "1234");
        Bank account2 = new Bank("987654", "심사임당", 500000, "9876");

        account1.showAccountInfo();
        System.out.println("--------------------------------------------");
        account2.showAccountInfo();
        System.out.println("--------------------------------------------");
        account1.desposit(5000, "1234");
        account1.withdraw(200000, "1234");
        account1.withdraw(100000,"1234");
        System.out.println("--------------------------------------------");
        account2.withdraw(100000, "9876");
        account2.desposit(200000, "9876");
        System.out.println("--------------------------------------------");
        account1.showAccountInfo();
        System.out.println("--------------------------------------------");
        account2.showAccountInfo();

//
//        System.out.println("임시 계좌개설을 시작합니다.");
//        String accountNum="";
//        for(int i=0 ; i<6 ; i++){
//            int temp = (int)(Math.random()*10);
//            accountNum+=String.valueOf(temp);
//        }
//        System.out.print("이름을 입력하여 주십시오. : ");
//        String name = sc.nextLine();
//        System.out.print("비밀번호 4자리를 입력하여 주십시오. : ");
//        String pin=sc.nextLine();
//        while(pin.length()!=4){
//            if(!pin.equals("")){
//                System.out.println("올바른 입력이 아닙니다. 숫자와 문자의 조합 4자리를 입력하여 주십시오.");
//            }
//            pin = sc.nextLine();
//        }
//
//        Bank account3 = new Bank(accountNum, name, 0, pin);
//        boolean continued = true;
//        while(continued){
//            System.out.println("--------------------------------------------");
//            System.out.println("1.입금 | 2.출금 | 3.정보 확인 | 4.종료");
//            System.out.println("--------------------------------------------");
//            System.out.print("메뉴를 선택하여 주세요. : ");
//            int choose = sc.nextInt();
//            sc.nextLine();
//            if (choose < 1 || choose > 4) {
//                System.out.println("올바르지 않은 입력입니다. 1~4까지의 수중 하나만 입력하여 주세요.");
//                continue;
//            }
//            System.out.println("--------------------------------------------");
//            String inputPin;
//            int amount;
//            switch(choose){
//                case 1:
//                    System.out.print("비밀번호를 입력하여 주십시오. : ");
//                    inputPin = sc.nextLine();
//                    System.out.print("입금할 금액을 입력하여 주십시오. : ");
//                    amount = sc.nextInt();
//                    sc.nextLine();
//                    account3.desposit(amount, inputPin);
//                    break;
//                case 2:
//                    System.out.print("비밀번호를 입력하여 주십시오. : ");
//                    inputPin = sc.nextLine();
//                    System.out.print("출금할 금액을 입력하여 주십시오. : ");
//                    amount = sc.nextInt();
//                    sc.nextLine();
//                    account3.withdraw(amount, inputPin);
//                    break;
//                case 3:
//                    account3.showAccountInfo();
//                    break;
//                case 4:
//                    System.out.print("뱅킹 시스템을 종료합니다.");
//                    return;
//            }
//        }
    }
}
