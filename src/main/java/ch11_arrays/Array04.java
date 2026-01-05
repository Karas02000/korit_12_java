package ch11_arrays;

import java.util.Arrays;

public class Array04 {
    public static void printElement(String[] strArr) {
        for(String i : strArr){
            System.out.print(i + " / ");
        }
    }

    public static void main(String[] args) {
        String[] title = {"김일", "김이", "김삼"};

        for(String i : title){
            System.out.print(i + " / ");

        }

        System.out.println();

        printElement(title);
        System.out.println(Arrays.stream(title));
    }
}
