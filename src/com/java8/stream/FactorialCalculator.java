//Java 8 program to find the factorial of a given number
package com.java8.stream;

import java.util.stream.IntStream;

public class FactorialCalculator {
    public static int calculateFactorial(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + ": " + factorial);
    }
}
