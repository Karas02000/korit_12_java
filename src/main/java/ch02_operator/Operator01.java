package ch02_operator;
/*
    Camel case >> Java 상에서의 변수 표기법(JavaScript에서도 사용)
    Snake case >> Java에서 쓸 일이 없습니다. 다만 상수 표기에서 비슷한 사용을 하긴 합니다.
    Pascal case >> 변수명의 모든 단어 첫 글자가 대문자로 표기되는 방식.
                    ex) TwoDucksFeed
 */

public class Operator01 {
    public static void main(String[] args) {
        int j = 10;
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j);
        System.out.println(j--);
        System.out.println(j);
        System.out.println(--j);
        System.out.println(j);










        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println("---- && 연산자 ----");
        boolean result1 = flag1 && flag1;
        System.out.println("T X T = "+result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T X F = "+result2);
        boolean result3 = flag2 && flag2;
        System.out.println("F X F = "+result3);
        System.out.println("---- || 연산자 ----");
        boolean result4 = flag1 || flag1;
        System.out.println("T X T = "+result4);
        boolean result5 = flag1 || flag2;
        System.out.println("T X F = "+result5);
        boolean result6 = flag2 || flag2;
        System.out.println("F X F = "+result6);
    }
}
