//Java 8 program to find the product of the first 10 natural numbers
package com.java8.stream;

import java.util.stream.LongStream;

public class ProductCalculator {
    public static void main(String[] args) {
        long product = productOfFirstNNaturalNumbers(10);
        System.out.println("Product of the first 10 natural numbers: " + product);
    }

    public static long productOfFirstNNaturalNumbers(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }
}
