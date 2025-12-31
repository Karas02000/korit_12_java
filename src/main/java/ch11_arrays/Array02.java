package ch11_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        String[] humans = new String[sc.nextInt()];
        sc.nextLine();
        double[] scores = new double[humans.length];
        double sum = 0;

        System.out.println();

        for(int i=0 ; i< humans.length ; i++) {
            System.out.print(i+1 + " 번 학생의 이름을 등록하세요 >>> ");
            humans[i] = sc.nextLine();
        }

        System.out.println();

        for(int i=0 ; i< humans.length ; i++) {
            System.out.print(humans[i] + " 학생의 점수를 입력하세요 >>> ");
            scores[i] = sc.nextDouble();
            sum += scores[i];
            sc.nextLine();
        }

        System.out.println("학생들의 점수 총합은 " + sum + "점 입니다.");
    }
}
