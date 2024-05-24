package com.java8.stream;

//Java 8 program to find the maximum element from a list

import java.util.List;
import java.util.Optional;
public class MaxNumberFinder {
    public static int findMaxNumber(List<Integer> numbers) {
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        return max.orElse(Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 2, 9, 5);
        int maxNumber = findMaxNumber(numbers);
        System.out.println("Maximum number: " + maxNumber);
    }
}
