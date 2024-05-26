//ava 8 program to sort all the values of the list in descending order
package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegersReverseSorter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        List<Integer> sortedNumbers = sortIntegersDescending(numbers);

        System.out.println("Sorted numbers in descending order: " + sortedNumbers);
    }

    public static List<Integer> sortIntegersDescending(List<Integer> numbers) {
        return numbers.stream()
                .sorted(java.util.Comparator.reverseOrder()) // Sort in descending order
                .collect(Collectors.toList());
    }
}
