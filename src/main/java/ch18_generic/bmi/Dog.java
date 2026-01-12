package ch18_generic.bmi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog {
    private String name;
    private double hight;
    private double weight;
    public Dog(){}
    public Dog(String name, double hight, double weight){}
}
