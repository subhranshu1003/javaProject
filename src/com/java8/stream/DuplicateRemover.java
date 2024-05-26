//Java 8 program to remove duplicate elements from a list
package com.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemover {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
