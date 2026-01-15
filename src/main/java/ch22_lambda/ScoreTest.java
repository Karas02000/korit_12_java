package ch22_lambda;

import java.util.ArrayList;
import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Integer> scores = List.of(12, 21, 36, 44, 5, 64, 788, 89, 94, 510);

        scores.stream().filter((s) -> s >=60).map((s -> s + 5)).sorted((a, b) -> a.compareTo(b)).forEachOrdered((a -> System.out.println(a)));
    }
}
