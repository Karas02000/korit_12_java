package ch03_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        변수의 값을 입력받게 할 수 있는 메서드.

        next (Int / Double / Boolean ... etc) vs. nextLine
            - nextLine()은 띄어쓰기를 허용합니다. enter키를 기준으로 데이터가 변수에 저장됩니다.
              그래서 scanner.nextLine() 으로 사용했읐 때 kim il로 띄어쓰기의 저장이 가능하다.
            - nextLine()을 제외한 키워드에서는 띄어쓰기 저장이 불가능하다.
            - nextLine()은 띄어쓰기가 포함되는 부분에서 데이터 정리나 적용, 처리 등에서 타보다 번거로울 수도 있다.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("지금의 연도는? >> ");
        int year = sc.nextInt();
        // enter키를 받아주는 nextLine()의 추가
        sc.nextLine(); // 데이터를 활용하는 것이 아닌 엔터 입력이 다른 input의 값에 작용햐지 않게 만들어줌.

        System.out.print("당신의 이름은? >> ");
        String name = sc.nextLine();
        System.out.println("연도 : " + year);
        System.out.println("이름 : " + name);
    }
}
