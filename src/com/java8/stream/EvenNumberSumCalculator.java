//Java 8 program to find the sum of all even numbers in a list of integers
package com.java8.stream;

import java.util.List;

public class EvenNumberSumCalculator {
    public static int calculateEvenNumberSum(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenSum = calculateEvenNumberSum(numbers);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
