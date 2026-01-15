package ch22_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        System.out.println(fruits);

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("과일명 : " + fruits.get(i));
        }

        System.out.println("");

        for (String fruit : fruits) {
            System.out.println("과일명 : " + fruit);
        }

        System.out.println();

        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));

        System.out.println(fruits);
        fruits.stream().map(fruit -> "과일명 : " + fruit).forEach(System.out::println);
        System.out.println(fruits);

        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums);
        nums.forEach(num -> System.out.print((num*2)+" "));
        System.out.println("\n" + nums);
    }
}
