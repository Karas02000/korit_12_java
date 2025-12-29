package ch08_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.speed = 160;
        myCar.color = "빨강";

        yourCar.speed = 180;
        yourCar.color = "노랑";

        myCar.drive();
        yourCar.brake();

        myCar.displayInfo();
        yourCar.displayInfo();

    }
}
