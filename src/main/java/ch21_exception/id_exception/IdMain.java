package ch21_exception.id_exception;

import java.util.Scanner;

public class IdMain {

    public static void checkId(String id) throws InvalidIdException {
        if (id.length() < 8) {
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("ID를 입력하여 주세요. >>>");
            String id = sc.nextLine();
            checkId(id);
        } catch (InvalidIdException e) {
            System.out.println("오류 발생 : " + e.getMessage());
        } catch (Exception e) {}
    }
}
