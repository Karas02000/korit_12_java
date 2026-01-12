package ch18_generic.bmi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private double hight;
    private double weight;
    public Person(){}
    public Person(String name, double hight, double weight){}
}
