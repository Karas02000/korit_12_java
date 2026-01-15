package ch21_exception.store;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StoreMain {
    public static void order(int quantity) {
        if (quantity < 1 ||  quantity > 50) {
            throw new InvalidOrderQuantityException("주문 수량은 한번에 1~50까지만 가능합니다.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int stock = sc.nextInt();
            order(stock);
        } catch(InvalidOrderQuantityException e) {
            System.out.println ("오류 발생 : " + e.getMessage());
        } catch(InputMismatchException e) {
            System.out.println ("정수만 입력하여 주십시오.");
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("예기치못한 문제가 발생하였습다.");
        } finally {
            System.out.println("주문 프로세스 완료");
        }
    }
}
