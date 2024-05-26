// Java 8 program to find the last element in a list
package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LastElementFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> lastElement = findLastElement(numbers);
        if (lastElement.isPresent()) {
            System.out.println("Last element: " + lastElement.get());
        } else {
            System.out.println("List is empty");
        }
    }

    public static <T> Optional<T> findLastElement(List<T> list) {
        return list.stream()
                .reduce((first, second) -> second);
    }
}
