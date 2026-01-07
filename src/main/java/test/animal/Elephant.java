package test.animal;

public class Elephant implements Animal {
    @Override
    public void move() {
        System.out.println("Elephant move");
    }
    @Override
    public void crying() {
        System.out.println("Bird crying");
    }
}
