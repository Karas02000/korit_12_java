package ch11_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3,4,5};
        System.out.println(arr01);

        for (int i=0 ; i< arr01.length ; i++){
            System.out.println(arr01[i]);
        }

        int[] arr03 = new int [10];

        arr03[0]=10;

        int[] arr04 = new int[40];
        for(int i=0 ; i<arr04.length ; i++) {
            arr04[i] = 41+i;
        }
        for(int i=0 ; i<arr04.length ; i++) {
            System.out.println(arr04[i]);
        }

        String[] hello = {"안","녕","하","세","요"};
        for(int i=0 ; i<hello.length ; i++){
            System.out.print(hello[i]);
        }
    }
}
