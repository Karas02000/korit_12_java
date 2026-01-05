package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Array11 {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] numbers = new Integer[10];

        for(int i=0 ; i<numbers.length ; i++) {
            numbers[i] = rand.nextInt(1,10);
        }
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));

        int index = 0;
        for(Integer i : numbers) {
            numbers[index++] = i*10;
        }
        for(Integer i : numbers) {
            System.out.print(i + " / ");
        }
    }
}
