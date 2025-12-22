package ch00_starting;

public class Main {
    /*
        주석(comment) : Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링 하는데, 거기서 오류가 하나라도 발생하게 되면 전체 프로그램 실행이 되지 않는다.
                       하지만 주석처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에 오류가 발생하지 않습니다.
                       주석은 함께 일하는 동료 개발자들과 정보를 공유하기 위한 코드입니다.
     */
    public static void main(String[] args) {

        // 자료형 수업

        // 정수 자료형
        // 숫자 자료형은 연산이 가능하다.
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);    // 결과값 : 300
        String width3 = "100";
        String width4 = "200";
        System.out.println(width3+width4);      // 결과값 : 100200
        String name4 = "안";
        String name5 = "근수";
        System.out.println(name4+name5);        // 결과값 : 안근수
        System.out.println(width1-width2);      // 결과값 : -100
        //문자열도 + 연산은 가능하며, 문자열의 + 연산은 수학 연산이 아니라, "나열"의 의미이다.

        Integer width5 = 500;
        Integer width6 = 600;
        System.out.println(width5+width6);      // 결과값 : 1100
        // 자료형 int 뿐만 아니라 대문자로 시작되는 자료형인 integer도 있다.


        // 실수 자료형
        double pi = 3.1415926;

        //논리 자료형
        boolean Flag1 = false;
        boolean Flag2 = true;
        System.out.println(Flag1);
        System.out.println(Flag2);

        // 문자 자료형
        char mon = '월';
        char tue = '화';
        char wed = '수';
        char tur = '목';
        char fri = '금';

        System.out.println(mon);
        System.out.println(tue);
        System.out.println(wed);
        System.out.println(tur);
        System.out.println(fri);

        char name1 = '신';
        char name2 = '원';
        char name3 = '준';

        System.out.println(""+name1+name2+name3);
        System.out.println("안녕하세요 제 이름은 "+name1+name2+name3+"입니다.");
    }
}
