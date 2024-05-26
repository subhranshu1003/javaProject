//Java 8 program to convert all strings to uppercase in a list
package com.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StringConverter {
    public static List<String> convertToUpperCase(List<String> strings) {
        return strings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry");
        List<String> uppercaseStrings = convertToUpperCase(strings);
        System.out.println("Uppercase strings: " + uppercaseStrings);
    }
}
