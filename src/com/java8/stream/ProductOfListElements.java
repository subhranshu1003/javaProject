//Java 8 program to check if all elements in a list are unique
package com.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductOfListElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean allUnique = areAllElementsUnique(numbers);
        if (allUnique) {
            System.out.println("All elements in the list are unique.");
        } else {
            System.out.println("List contains duplicate elements.");
        }
    }

    public static boolean areAllElementsUnique(List<Integer> list) {
        return list.stream()
                .collect(Collectors.toSet())
                .size() == list.size();
    }
}
