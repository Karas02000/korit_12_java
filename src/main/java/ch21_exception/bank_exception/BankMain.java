package ch21_exception.bank_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {
    public static void withdraw(int amount) throws InsufficientBalanceException {
        if(amount > 10000) {
            throw new InsufficientBalanceException("잔액이 부족합니다. (부족 금액: " + (amount-10000) +"원)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        try {
            int money = sc.nextInt();
            withdraw(money);
            System.out.println("출금에 성공하였습니다.");
            balance -= money;
        } catch (InsufficientBalanceException e) {
            System.out.println("오류발생" + e.getMessage());
            System.out.println("잔액이 모자랍니다.");
        } catch (InputMismatchException e) {
            System.out.println("정수로 입력해주세요.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("예기치못한 문제가 발생하였습다.");
        } finally {
            System.out.println("잔액 : " +  balance);
        }
    }
}
