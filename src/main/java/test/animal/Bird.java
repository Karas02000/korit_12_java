package test.animal;

public class Bird implements Animal {
    @Override
    public void move() {
        System.out.println("Bird move");
    }
    @Override
    public void crying() {
        System.out.println("Bird crying");
    }
}
