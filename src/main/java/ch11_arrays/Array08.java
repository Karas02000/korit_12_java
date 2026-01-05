package ch11_arrays;

public class Array08 {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for(int i=0 ; i<100 ; i++) {
            nums[i] = i+1;
        }
        for(int i : nums) {
            System.out.print(i + "\t");
            if(i%10 == 0) {
                System.out.println();
            }
        }
    }
}
