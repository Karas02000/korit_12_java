package ch12_inheritance;

public class Tiger extends Animal {
    private double weight;

    public Tiger(){}
    public Tiger(String animalName, int animalAge, double weight) {
        super(animalName,animalAge);
        setWeight(weight);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void hunt(String prey) {
        System.out.println(prey + "을(를) 사냥합니다.");
    }

    public void showWeight() {
        System.out.println(getAnimalName() + "의 몸무게는 " + getWeight() + "t 입니다.");
    }

    @Override
    public void move() {
        System.out.print(getAnimalName() + "가(이) ");
        super.move();
    }
}
