package ch09_getter_setter.univ_student.UnivStudent;

public class UnivStudent {
    private String name;
    private int grade;
    private double score;

    // Contructor
    public UnivStudent(){}
    public UnivStudent(String name){
        setName(name);
    }
    public UnivStudent(int grade){
        setGrade(grade);
    }
    public UnivStudent(String name, int grade){
        setName(name);
        setGrade(grade);
    }
    public UnivStudent(String name, int grade, double score){
        setName(name);
        setGrade(grade);
        setScore(score);
    }


    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(int grade){
        if(grade < 1 || grade > 4){
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.grade = grade;
    }
    public void setScore(double score){
        if(score < 0 || score > 4.5){
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    // Getter
    public String getName(String name){
        return name;
    }
    public int getGrade(int grade){
        return grade;
    }
    public double getScore(double score){
        return score;
    }

    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("점수 : " + score);
    }
}
