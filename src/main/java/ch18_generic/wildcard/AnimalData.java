package ch18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;
    /*
        현재 AnimalData의 field인 animal에 Animal 클래스의 상속을 받은 Tiger / Human 객체를 field에 대입할겁니다.
        그런데 T에는 어떠한 클래스도 들어갈 수 있기에 현재로서는 Car 클래스의 객체도 animal에 들어갈 수 있다고 해석할 수 있겠네요.
        이번 목표는 특정 클래스라면(즉 Animal 클래스의 상속을 받은 서브 클래스라면) 해당 클래스에 맞는 객체 정보를 출력하도록 작성할겁니다.
     */
    public void showData() {
        ((Animal) animal).move(); // 지금 보면 T에는 아무 클래스나 들어갈 수 있으므로 (Animal) 부분은 Animal로 형변환해 주겠네요.
        if(animal.getClass() == Human.class) {
            ((Human) animal).read();
        } else if(animal.getClass() == Animal.class) {
            ((Tiger) animal).hunt();
        } else {
            System.out.println("아직 고유 메서드가 없거나 Animal의 서브 클래스가 아닙니다.");
        }
    }
}
