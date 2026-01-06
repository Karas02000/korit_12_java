package ch11_arrays;

public class Array13Multi {
    public static void main(String[] args) {
        int[][] arr03 = {{1,2},{3,4},{5,6}};

        for(int i=0 ; i<arr03.length ; i++) {
            System.out.println(arr03[i]);
        }

        for(int[] i : arr03) {
            for(int j : i) {
                System.out.print(j + " - ");
            }
            System.out.println();
        }
    }
}
