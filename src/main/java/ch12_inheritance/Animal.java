package ch12_inheritance;

public class Animal {
    private String animalName;
    private int animalAge;

    public Animal(){

    }

    public Animal(String animalName){
        setAnimalName(animalName);
    }

    public Animal(int animalAge){
        setAnimalAge(animalAge);
    }

    public Animal(String animalName, int animalAge){
        setAnimalName(animalName);
        setAnimalAge(animalAge);
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void move(){
        System.out.println("움직입니다.");
    }
}
