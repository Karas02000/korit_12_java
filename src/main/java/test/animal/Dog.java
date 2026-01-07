package test.animal;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("Dog move");
    }
    @Override
    public void crying() {
        System.out.println("Dog crying");
    }
}
