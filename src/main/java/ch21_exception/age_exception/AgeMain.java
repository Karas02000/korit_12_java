package ch21_exception.age_exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeMain {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 200) {
            throw new InvalidAgeException("나이는 0~200 사이의 정수만 가능합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요. >>> ");

        try {
            int age = sc.nextInt();
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("나이 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력할 수 있습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("예기치못한 문제가 발생하였습다.");
        }
    }
}
