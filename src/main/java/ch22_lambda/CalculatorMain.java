package ch22_lambda;

public class CalculatorMain {

    public static int operate(int a, int b, Calculator c){
        return c.compute(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (int x, int y) -> x + y;
        Calculator sub = (int x, int y) -> x - y;
        Calculator mul = (int x, int y) -> x * y;
        Calculator div = (int x, int y) -> x / y;

        System.out.println("2 + 3 = " + operate(2, 3, add));
        /*
            oprate의 세 번째 매개변수는 Calculator interface의 서브 클래스를 받습니다.
            그리고 operate() 메서드의 return 값은 기본적으로 compute()를 return 하는 것을 알 수 있다.
            그러나 interface는 추상메서드 하나만 가졌으니 구현부가 있는 객체값을 확인해봐야 한다.
         */
        System.out.println(sub.compute(3,4));
        System.out.println(operate(4,5,mul));
        /*
            즉 여러분들은 클래스들 간의 일반 메서드 / 정적 메서드 뿐만 아니라 어디서 빠져나온 함수형 interface의 추상 메서드를 구현한
            어떤 버전을 일반 표현식으로 썼든 람다식으로 썻든 다 해석해서 어떻게 호추랗ㄹ지 까지 알 필요가 있다는 의미가 된다.
         */
    }
}
