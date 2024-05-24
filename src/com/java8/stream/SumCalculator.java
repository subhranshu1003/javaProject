package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class SumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);
    }

    public static int calculateSum(List<Integer> numbers) {
       // return numbers.stream().mapToInt(i -> i).sum();
        return numbers.stream().mapToInt(i -> i.intValue()).sum();
       // return numbers.stream().reduce(0, Integer::sum);
    }
}
