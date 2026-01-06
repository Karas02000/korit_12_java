package ch12_inheritance.animal;

public class Human extends Animal {
    public Human() {}
    public Human(String animalName, int animalAge) {
        super(animalName,animalAge);
    }

    public void move() {
        System.out.println(getAnimalName() + "가(이) 두발로 걷습니다.");
    }

    public void read(String title) {
        System.out.println(getAnimalName() + "가(이) " + title + "을(를) 읽는 중입니다.");
    }

    public void showInfo() {
        System.out.println("안녕하세요 제 이름은 " + getAnimalName() + "이고, 나이는 " + getAnimalAge() + "살 입니다.");
        System.out.println("내년에는 " + (getAnimalAge()+1) + "살이 됩니다.");
    }
}
