package ch12_inheritance;

public class Main {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.move();
//        animal1.setAnimalName("동물");
//        animal1.setAnimalAge(14);
//
//        Tiger tiger1 = new Tiger();
//        tiger1.setAnimalName("노랭이");
//        tiger1.setAnimalAge(1);
//        System.out.println("이 호랑이의 이름은 " + tiger1.getAnimalName() + "이고, 나이는 " + tiger1.getAnimalAge() + "살 입니다.");
//        tiger1.move();
//        tiger1.setWeight(1.4);
//        tiger1.showWeight();
//
//        tiger1.move();
//

        Human human1 = new Human();
        human1.setAnimalName("신원준");
        human1.setAnimalAge(24);
        human1.showInfo();
        human1.move();
        human1.read("자바의 기초");
    }
}
