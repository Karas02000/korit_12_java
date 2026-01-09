package ch17_static;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person.Builder().age(21).adress("부산광역시 부산진구").name("김일").build();
        System.out.println(person1);

        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder().name("김삼").build();
        System.out.println(person3);

        Person2 person4 = Person2.builder().name("김사").build();
        System.out.println(person4);

        Person2 person5 = Person2.builder().build();
        System.out.println(person5);
    }
}
