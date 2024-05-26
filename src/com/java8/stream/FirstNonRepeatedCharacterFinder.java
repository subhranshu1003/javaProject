//Java 8 program print first non repetitive character in the string
package com.java8.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterFinder {
    public static void main(String[] args) {
        String str = "hello world";

        Character firstNonRepeatedChar = findFirstNonRepeatedChar(str);

        System.out.println("First non-repeated character: " + firstNonRepeatedChar);
    }

    public static Character findFirstNonRepeatedChar(String str) {
        return str.chars()     // IntStream
                .mapToObj(i -> Character.toLowerCase((char) i))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap ::new, Collectors.counting())) // store in a LinkedHashMap with the count
                .entrySet().stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
                .map(Map.Entry::getKey)              // get the keys of EntrySet
                .findFirst().get();                  // get the first entry from the keys
    }
}
