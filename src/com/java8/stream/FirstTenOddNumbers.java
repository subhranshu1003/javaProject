//java 8 program to prints the first 5 odd numbers
package com.java8.stream;

import java.util.stream.IntStream;

public class FirstTenOddNumbers {
    public static void main(String[] args) {
        System.out.println("First 10 odd numbers:");
        printFirstTenOddNumbers();
    }

    public static void printFirstTenOddNumbers() {
        IntStream.iterate(1, n -> n + 2) // Start from 1 and increment by 2 to get odd numbers
                .limit(10) // Limit to the first 5 odd numbers
                .forEach(System.out::println); // Print each odd number
    }
}
