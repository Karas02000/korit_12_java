package ch18_generic.bmi;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("김일");
        person1.setHight(170);
        person1.setWeight(90);

        Bmi calc = new Bmi();
        double bmi = calc.calcBmi(person1);
        String result = calc.calcGrade(bmi);
        System.out.printf("%s님의 키는 %.1f cm, 몸무게는 %.1f kg, bmi 지수는 %.2f으로 %s입니다", person1.getName(), person1.getHight(), person1.getWeight(),bmi ,result);
    }
}

class Bmi {

    public Bmi(){}

    public double calcBmi(Person person) {
        double num1 = person.getHight()/100;
        double num2 = num1*num1;
        double bmi = person.getWeight() / num2;
        return bmi;
    }

    public String calcGrade(double bmi) {
        String result = "";

        if (bmi < 0) {
            System.out.println("비정상적인 값입니다. 다시 입력하여 주십시오.");
        } else if (bmi < 18.5) {
            result = "저체중";
        } else  if (bmi >= 18.5 && bmi < 22.9) {
            result = "정상";
        } else if (bmi >= 23 && bmi < 24.9) {
            result = "비만 전단계";
        } else if (bmi >= 25 && bmi < 29.9) {
            result = "1단계 비만";
        } else if (bmi >= 30 && bmi < 34.9) {
            result = "2단계 비만";
        } else {
            result = "3단계 비만";
        }
        return result;
    }
}
