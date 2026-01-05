package ch11_arrays;

public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A", "B", "C", "D","F"};

        System.out.println(1);

        for(String i : scores) {
            if(i.equals("F")){
                System.out.print(i);
            } else {
                System.out.print(i + "+ / ");
            }
        }

        System.out.println();
        System.out.println(2);

        for(int i = 0; i < scores.length ; i++) {
            if(i == scores.length - 1){
                System.out.print(scores[i]);
            } else {
                System.out.print(scores[i] + "+ / ");
            }
        }

        System.out.println();
        System.out.println(3);

        for(String i : scores) {
            System.out.print(i);
            if(i.equals("F")){
                break;
            }
            System.out.print("+ / ");
        }

        System.out.println();
        System.out.println(4);

        for(int i = 0 ; i < scores.length ; i++) {
            System.out.print(scores[i]);
            if(i == scores.length - 1){
                break;
            }
            System.out.print("+ / ");
        }
    }
}
