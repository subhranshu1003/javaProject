//Java 8 program to calculate the average of even numbers in a list of integers

package com.java8.stream;

import java.util.List;
import java.util.OptionalDouble;

public class EvenNumberAverageCalculator {
    public static double calculateAverageOfEvenNumbers(List<Integer> numbers) {
        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .average();
        return average.orElse(0.0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double average = calculateAverageOfEvenNumbers(numbers);
        System.out.println("Average of even numbers: " + average);
    }
}
