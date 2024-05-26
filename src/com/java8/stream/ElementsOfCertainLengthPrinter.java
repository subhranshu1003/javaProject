//java 8 program print all the strings of given length
package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class ElementsOfCertainLengthPrinter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        int targetLength = 6;

        printElementsOfCertainLength(list, targetLength);
    }

    public static void printElementsOfCertainLength(List<String> list, int targetLength) {
        list.stream()
                .filter(str -> str.length() == targetLength)
                .forEach(System.out::println);
    }
}
