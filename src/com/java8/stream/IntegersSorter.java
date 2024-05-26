//Java 8 program to sort all the values of the list in ascending order
package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegersSorter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        List<Integer> sortedNumbers = sortIntegers(numbers);

        System.out.println("Sorted numbers: " + sortedNumbers);
    }

    public static List<Integer> sortIntegers(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
