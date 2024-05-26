//ava 8 program to find all the numbers starting with 2 in given list
package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(223, 234, 145, 367, 289, 2001, 2289);
        List<Integer> numbersStartingWithOne = filterNumbersStartingWithOne(numbers);
        System.out.println("Numbers starting with 1: " + numbersStartingWithOne);
    }

    public static List<Integer> filterNumbersStartingWithOne(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> String.valueOf(number).startsWith("2"))
                .collect(Collectors.toList());
    }
}
