package ch04_conversion;

public class Main {
    public static void main(String[] args) {
        // 1. upcasting(업캐스팅)
        // 업캐스팅 방법 #1
        // 형변환을 하기 위해서는 '(바꿀 데이터타입) 변수명'으로 작성하면 된다.
        char cast1 = 'A';
        System.out.println("원형 : "+cast1);
        System.out.println("변형 : "+(int)cast1);
        System.out.println();

        char cast2 = 'a';
        System.out.println("원형 : "+cast2);
        System.out.println("변형 : "+(int)cast2);
        System.out.println();

        // 업캐스팅 방법 #2
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 새로 집어넣는다.
        char cast3 = 'b';
        int casted3 = cast3;
        System.out.println("원형 : "+cast3);
        System.out.println("변형 : "+casted3);

        /*
            업캐스팅의 경우 데이터 변형이 일어날 가능성이 없어서 암시적(implicit)으로 변형이 가능한 반면,
            다운캐스팅의 경우 데이터 용량이 축소되는 과정에서 변수가 메모리 용량을 벗어나게 되는 경우가 있습니다.
            용량 오버에 해당하는 현상을 미리 점검하기 위해 다운캐스팅시에는 명시적(explicit)으로만 변경이 가능하다.
         */
    }
}
