package ch06_loops;

public class Loop03While2 {
    public static void main(String[] args) {
        int day = 1;
        while (day < 6){
            int lesson = 1;
            while (lesson < 4){
                System.out.println(day + "일차 " + lesson + "교시입니다.");
                lesson++;
            }
            day++;
            System.out.println();
        }


    }
}
