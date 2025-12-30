package ch09_getter_setter.univ_student.UnivStudent;

public class UnivStudentMain {
    public static void main(String[] args) {
        // student1 초기화
        UnivStudent student1 = new UnivStudent();
        student1.setName("김일");
        student1.setGrade(1);
         student1.setScore(3.3);


        // student2 초기화
        UnivStudent student2 = new UnivStudent();
        student2.setName("김이");
        student2.setGrade(3);
        student2.setScore(-30);
        student2.setScore(4.0);


        // student3 초기화
        UnivStudent student3 = new UnivStudent();
        student3.setName("김삼");
        student3.setGrade(5);
        student3.setScore(3.3);
        student3.setGrade(2);
        student3.setScore(2.7);


        // student4 초기화
        UnivStudent student4 = new UnivStudent();
        student4.setName("김사");
        student4.setGrade(4);
        student4.setScore(3.8);

        // student5 초기화
        UnivStudent student5 = new UnivStudent();
        student5.setName("김사");
        student5.setGrade(2);
        student5.setScore(1.0);


        student1.showInfo();
    }
}
