package test.animal;

public class Fox implements Animal {
    @Override
    public void move() {
        System.out.println("Fox move");
    }
    @Override
    public void crying() {
        System.out.println("Fox crying");
    }
}
