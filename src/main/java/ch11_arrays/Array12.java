package ch11_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Array12 {
    public static void main(String[] args) {
        Random random = new Random();

        Integer[] numbers = new Integer[10];
        for(int i=0 ; i<10 ; i++) {
            numbers[i] = random.nextInt(1,101);
        }

        int index = 0;
        for (int i : numbers) {
            numbers[index++] = i*10;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
