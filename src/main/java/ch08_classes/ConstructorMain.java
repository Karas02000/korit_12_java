package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(2);
        Constructor constructor4 = new Constructor("김사");
        Constructor constructor5 = new Constructor(5, "김오");

        System.out.println(constructor5.num);
        System.out.println(constructor5.name);

        constructor5.displayInfo();
    }
}
