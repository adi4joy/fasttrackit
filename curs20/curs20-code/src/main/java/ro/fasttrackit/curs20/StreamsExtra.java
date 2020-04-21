package ro.fasttrackit.curs20;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExtra {
    public static void main(String[] args) {
        IntStream.range(1, 11)
                .forEach(System.out::println);
        System.out.println(
                IntStream.range(20, 40)
                        .sum());
        //average
        System.out.println(
                IntStream.range(1, 11)
                        .average());
        //count
        System.out.println(
                IntStream.range(1, 11)
                        .count());
        //sum even
        System.out.println(
                IntStream.range(1, 11)
                        .filter(i -> i % 2 == 0)
                        .sum());

        System.out.println(
                IntStream.range(44, 80)
                        .min());

        System.out.println(
                IntStream.range(1, 10)
                        .max());

        int[] ints = new int[]{1, 5, 7, 3, 7, 9, 2};
        System.out.println(IntStream.of(ints)
                .min());

        IntStream.of(ints)
                .map(a -> a + 1)
                .forEach(System.out::print);
        System.out.println();
        System.out.println(IntStream.of(ints)
                .mapToObj(a -> "element " + a)
                .collect(Collectors.joining("~")));
//                .forEach(System.out::println);

    }
}
