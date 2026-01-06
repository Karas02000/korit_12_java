package ch11_arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];

         for(int i=0 ; i<20 ; i++) {
             for(int j=0 ; j<5 ; j++) {
                 nums[i][j] = (i*5) + j +1;
             }
         }

         for(int[] i : nums) {
             for(int j : i) {
                 System.out.print(j + "\t");
             }
             System.out.println();
         }
    }
}
