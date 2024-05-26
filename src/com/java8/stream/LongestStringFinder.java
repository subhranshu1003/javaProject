//Java 8 program to find the longest string in a list of strings
package com.java8.stream;

import java.util.List;
import java.util.Optional;

public class LongestStringFinder {
    public static String findLongestString(List<String> strings) {
        Optional<String> longest = strings.stream()
                .max((s1, s2) -> s1.length() - s2.length());
        return longest.orElse(null);
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry", "grapefruit");
        String longestString = findLongestString(strings);
        System.out.println("Longest string: " + longestString);
    }
}
