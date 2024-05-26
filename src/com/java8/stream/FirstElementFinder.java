// Java 8 program to find the first element of the given integers list
package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElementFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> firstElement = findFirstElement(numbers);

        if (firstElement.isPresent()) {
            System.out.println("First element of the list: " + firstElement.get());
        } else {
            System.out.println("The list is empty.");
        }
    }

    public static Optional<Integer> findFirstElement(List<Integer> numbers) {
        return numbers.stream().findFirst();
    }
}
