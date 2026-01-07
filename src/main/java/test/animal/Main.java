package test.animal;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Elephant elephant = new Elephant();
        Fox fox = new Fox();

        Animal[] animals = new Animal[]{bird, cat, dog, elephant, fox};

        for(Animal animal : animals) {
            animal.move();
        }
    }
}
