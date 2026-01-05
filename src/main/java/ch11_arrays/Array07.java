package ch11_arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        String[] grades = {"A","B","C","D","F"};
        int[] gradeNums = {0,0,0,0,0};

        for(int i : scores) {
            int index=0;
            if(i >= 90){
                index = 0;
            }else if(i >= 80){
                index = 1;
            }else if(i >= 70){
                index = 2;
            }else if(i >= 60){
                index = 3;
            }else{
                index = 4;
            }
            System.out.print(grades[index] +" / ");
            gradeNums[index]++;
        }

        System.out.println();

        for(int i=0 ; i< grades.length ; i++){
            System.out.println(grades[i] + "등급 : " + gradeNums[i] + "명");
        }

    }
}
