//Java 8 program to sort given list of strings according to decreasing order of their length
package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StringLengthSorter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "orange", "grape", "kiwi");

        List<String> sortedStrings = sortStringsByLength(strings);

        System.out.println("Sorted strings by length (decreasing order): " + sortedStrings);
    }

    public static List<String> sortStringsByLength(List<String> strings) {
        return strings.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())) // Sort strings by length in decreasing order
                .toList(); // Convert the stream to a list
    }
}
