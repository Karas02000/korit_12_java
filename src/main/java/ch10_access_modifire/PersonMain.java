package ch10_access_modifire;

class Person{
    private String name;

    public Person(){
    }
    public Person(String name){
        setName(name);
    }

    public void setName(String name){
        if (name.length() > 4){
            System.out.println("글자 수 제한을 넘어섰습니다.");
            return;
        }
        System.out.println("이름이 " + name + "(으)로 설정되었습니다.");
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("김일");
        p1.setName("스티븐 로저스");
        p1.setName("이일");
        System.out.println("현재 이름 : " + p1.getName());
    }
}
