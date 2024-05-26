// Java 8 program to find the second smallest element in a list of integers
package com.java8.stream;

import java.util.List;
import java.util.Optional;

public class SecondSmallestFinder {
    public static int findSecondSmallestElement(List<Integer> numbers) {
        Optional<Integer> secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();
        return secondSmallest.orElse(Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 4, 2, 5);
        int secondSmallest = findSecondSmallestElement(numbers);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
