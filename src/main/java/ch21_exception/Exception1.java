package ch21_exception;

/*
    예외(Exception)란?
        개발자가 예측할 수 있고, 그에 대한 대비를 할 수 있는 것들을 예외로 정의한다.
    오류(Error)란?
        개발자가 예측은 할 수 있지만 해결할 수 없거나 예측 불가능한 것을 오류로 정의한다.

    그러면 모든 자료형이 클래스 형태로 정의되는 Java의 특성 상 자주 일어나는 예외 클래스들은 이미 개발자들이 정의를 해놓았습니다.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
//        int[] ints = new int[5];
//        ints[5] = 3;
//        int a = 10;     // 피제수 / 나누어지는 수
//        int b = 0;      // 제수 / 나누는 수
//        double result = (double) a / b;
//        System.out.println(result);

//        int c = 0.123;
//        int d = c;
        /*
            고전적인 형태의 예외 처리 방식 -> if 문 사용
         */
        Scanner sc = new Scanner(System.in);
//        System.out.print("나누어지는 정수를 입력하세요.\t>>> ");
//        int a = sc.nextInt();
//        System.out.print("나누는 정수를 입력하세요.\t\t>>> ");
//        int b = sc.nextInt();

//        if (b==0) {
//            System.out.println("0으로는 나눌 수 없습니다.");
//        } else {
//            int result = a/b;
//            System.out.println(result);
//        }

        /*
            예외 처리를 적용한 방식의 코딩 try / catch / finally
         */

//        int a1 = 10;
//        int b1 = 0;
//        try {
//            int result = a1/b1;
//            System.out.println("결과 : " + result);
//        } catch (Exception e) {
//            System.out.println("0으로는 나눌 수 없습니다. : " + e.getMessage());
//        } finally{
//            System.out.println("예외 발생과 무관하게 무조건 실행되는 코드");
//        }
        /*
            왜 예외 처리 하는가?
                : 정상종료를 보증하기 위해서.
         */
        try {
            List<Integer> list = List.of(1, 2, 3, 4, 5);
            System.out.println(list);
            System.out.println(list.get(5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
/*
    이상의 코드 라인에서 중요한 점은 catch문이 복수로 나올 수 있다는 점
    근데 예를 들어 catch()를 사용할 때 순서를 고려할 필요가 있습니다.
    leepYear 관련할때 가장 촘촘한 조건을 앞에 위치시켰던 것 처럼요.
 */