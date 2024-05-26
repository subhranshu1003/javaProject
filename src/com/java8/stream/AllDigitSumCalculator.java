//Java 8 program to find sum of all digits of a number
package com.java8.stream;

import java.util.Arrays;

public class AllDigitSumCalculator {
    public static void main(String[] args) {
        int number = 12345;

        int digitSum = calculateDigitSum(number);

        System.out.println("Sum of digits of " + number + " is: " + digitSum);
    }

    public static int calculateDigitSum(int number) {
        return Arrays.stream(String.valueOf(number).split("")) // Convert number to string and split into individual digits
                .mapToInt(Integer::parseInt) // Map each digit to an integer
                .sum(); // Sum all the digits
    }
}
