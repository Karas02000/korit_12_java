package ch06_loops;

public class Loop07Star {
    public static void main(String[] args) {
        for(int i=0 ; i<5 ; i++){
            if(i%2==1){
                System.out.print("  ");
            }
            for(int j=0 ; j<30 ; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }

        for(int i=0 ; i<=5 ; i++){
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=5 ; i>=0 ; i--){
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
