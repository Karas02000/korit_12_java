package ch17_static;

import java.util.Locale;

public class Person {
    private String name;
    private int age;
    private String adress;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.adress = builder.adress;
    }

    public static class Builder{
        private String name;
        private int age;
        private String adress;
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder adress(String adress){
            this.adress = adress;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}

