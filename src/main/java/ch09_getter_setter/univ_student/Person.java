package ch09_getter_setter.univ_student;

public class Person {
    String name;
    int age;
    String adress;

    public Person(){}
    public Person(String name){
        setName(name);
    }

    public void setName(String name){
        if(name.length() > 4){
            System.out.println("이름을 변경할 수 없습니다.");
        } else {
            System.out.println("이름이 변경되었습니다.");
            System.out.println("변경 전 : " + this.name);
            System.out.println("변경 후 : " + name);
            this.name = name;
        }
    }
    public void setAge(int age){
        if(age >= 0 && age <=200){
            this.age = age;
        }else{
            System.out.println("잘못된 값입니다.");
        }
    }
    public void setAdress(String adress){
        this.adress = adress;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAdress(){
        return this.adress;
    }

}
