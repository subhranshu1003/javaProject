//Java 8 program to check if a list contains a specific string
package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class ListContainsStringChecker {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "grape");

        String searchString = "orange";

        boolean containsString = containsString(list, searchString);

        if (containsString) {
            System.out.println("List contains the string: " + searchString);
        } else {
            System.out.println("List does not contain the string: " + searchString);
        }
    }

    public static boolean containsString(List<String> list, String searchString) {
        return list. //contains(searchString);
               stream()
               .anyMatch(searchString::equals); // Using method reference
    }
}
