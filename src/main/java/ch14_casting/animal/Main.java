package ch14_casting.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();


        Animal animal1 = dog1;
        animal1.makeSound();

        Animal animal2 = new Dog();
        animal2.makeSound();

        Animal animal0 = new Cat();
        animal0.makeSound();
        animal1.makeSound();

        boolean reult1 = animal1 instanceof Animal;
        System.out.println(reult1);
        boolean reult2 = animal1 instanceof Dog;
        System.out.println(reult2);
        boolean reult3 = dog1 instanceof Animal;
        System.out.println(reult3);
        boolean reult4 = animal2 instanceof Dog;
        System.out.println(reult4);

        Animal animal3 = new Animal();
        boolean reult5 = animal3 instanceof Animal;
        System.out.println(reult5);
        boolean reult6 = animal3 instanceof Dog;
        System.out.println(reult6);

        System.out.println("↑ 업캐스팅 파트 : 개게명.메서드명(); 했을 때, 자기 버전이 나오는지 재정의 버전이 나오는지를 주목");
        System.out.println("↓ 다운캐스팅 파트");

        Dog dog2 = (Dog) animal2;
        dog2.makeSound();
        dog2.fetch();

//        Dog dog3 = (Dog) animal3;
//        dog3.makeSound();
        Animal animal4 = new Dog();

        System.out.println("animal4 검증");

        if(animal4 instanceof Dog){
            animal4.makeSound();
            Dog dog4 = (Dog) animal4;
            dog4.fetch();
        } else if (animal4 instanceof Cat){
            Cat cat0 = (Cat) animal4;
            cat0.makeSound();
            cat0.scretch();
        }


    }
}
