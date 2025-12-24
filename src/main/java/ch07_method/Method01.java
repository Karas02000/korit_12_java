package ch07_method;

public class Method01 {

    public static void call1(){
        System.out.println("[ X | X ]");
        System.out.println("오늘의 기분은 나쁘지 않아.");
    }

    public static String call2(String example){
        System.out.println("[ O | X ]");
        return "오늘의 기분은 : "+example;
    }

    public static void main(String[] args) {
        String feeling = "I'm sick";
        call1();
        call2(feeling);
        System.out.println();
        System.out.println(call2(feeling));
    }
}
