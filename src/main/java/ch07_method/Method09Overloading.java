package ch07_method;

/*
    메소드 오버로딩(method overloading)
        매개변수의 유무 및 자료형의 차이, 개수의 차이를 나눠서 동일한 메서드 명을 지닌 메서드'들'을 정의할 수 있다.
        즉, 같은 메서드명을 가지지만 자료형, 개수를 달리하여 다른 메서드로 인지하는 것이 가능한 것이다..

        단어에는 그 개수에 한계가 있으며 같은 의미를 가지는 단어라 함은 더더욱 제한된다.
        혹은 어찌저찌 전부 나누어서 만들어두었다 하여도 이름을 과도하게 분리하는 것은 사용자 입장에서의 편의와 직관성에 문제가 생기며, 유지관리에도 좋지 않다.
        여기서 필요한 것이 오버로딩이다.
*/
public class Method09Overloading {
    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static String add(String str1, String str2){
        return str1+str2;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add("Hello","World!"));
    }
}
