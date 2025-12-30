package ch09_getter_setter.univ_student;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("김일일");

        person1.setName("김일이");
        person1.setAge(-10);
        person1.setAdress("부산광역시 부산진구");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAdress());

        System.out.println(person1.getName() + " 학생의 나이는 " + person1.getAge() + "살 이고, 주소는 " + person1.getAdress() + "입니다.");
    }
}
