package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array10PrintArray {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
//        int num1 = random.nextInt(1,10);
//        System.out.print("숫자를 입력하세요 >>> ");
//        int num2 = scanner.nextInt();
//        System.out.println(num1);
//        System.out.println(num2);

        int[] nums1 = new int[100];
        for(int i = 0; i< nums1.length ; i++) {
            nums1[i] = random.nextInt(1,11);
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.asList(nums1).toString());


        int[] nums2 = new int[10];
        for(int i = 0; i< nums2.length ; i++) {
            nums2[i] = random.nextInt(1,11);
        }
        System.out.println(Arrays.toString(nums2));
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));

        Integer[] nums3 = new Integer[10];
        for(int i = 0; i< nums3.length ; i++) {
            nums3[i] = random.nextInt(1,11);
        }
        System.out.println(Arrays.toString(nums3));
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));
        Arrays.sort(nums3, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums3));
    }
}
