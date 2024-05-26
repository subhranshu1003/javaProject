//Java 8 program to find the sum of digits of a list of integers
package com.java8.stream;

import java.util.List;

public class DigitSumCalculator {
    public static int calculateDigitSum(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> String.valueOf(n).chars().map(Character::getNumericValue).sum())
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(123, 456, 789);
        int digitSum = calculateDigitSum(numbers);
        System.out.println("Sum of digits: " + digitSum);
    }
}
