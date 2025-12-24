package ch07_method;

import java.util.Scanner;

public class Method03ScoreCalc1 {
    static Scanner sc = new Scanner(System.in);
    // -------------------------------------------------------------------------------
    public static void avg_method_manager(){
        int sub_num = get_sub_num();
        double sum = get_sum(sub_num);
        double avg = get_avg(sum,sub_num);
        do_print(sum,avg);
    }
    // -------------------------------------------------------------------------------
    public static double get_sum(int sub_num){
        double sum=0;
        for(int i=1 ; i<=sub_num ; i++){
            System.out.print(i + ". 과목의 점수를 입력하세요. >>> ");
            sum += sc.nextDouble();
        }
        return sum;
    }
    // -------------------------------------------------------------------------------
    public static double get_avg(double sum, int sub_num){
        return sum/sub_num;
    }
    // -------------------------------------------------------------------------------
    public static void do_print(double sum, double avg){
        System.out.println("점수 합계 : "+sum);
        System.out.println("점수 평균 : " + avg);
    }
    // -------------------------------------------------------------------------------
    public static int get_sub_num(){
        System.out.print("몇 개의 과목을 입력하시겠습니까? >>> ");
        int sub_num = sc.nextInt();

        return sub_num;
    }
    // -------------------------------------------------------------------------------
    public static void main(String[] args) {
        avg_method_manager();
    }
    // -------------------------------------------------------------------------------
}
