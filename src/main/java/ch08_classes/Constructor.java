package ch08_classes;

/*
    생성자의 특징 :
        1. 클래스의 이름과 생성자의 이름은 동일하다.
        2. return값이 없다.
        3. 객체 초기화 : 생성자는 객체의 필드 '초기화'를 담당한다.

    생성자의 정의 방식 :
        1. 기본 생성자 : 매개변수가 없는 생성자 (ex : Class1 class1 = new Class1())
        2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자. (ex : Class1 class1 = new Class1(value))

    기본 생성자의 정의 : 접근제한자가 원래 default, 매개변수의 유무만 있고 return이 없어서 void를 굳이 명시하지 않는다.

 */

public class Constructor {
    int num;
    String name;

    public Constructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    public Constructor(int number){
        this.num=number;
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
    }
}
