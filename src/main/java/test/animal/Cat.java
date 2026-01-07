package test.animal;

public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("Cat move");
    }
    @Override
    public void crying() {
        System.out.println("Cat crying");
    }
}
