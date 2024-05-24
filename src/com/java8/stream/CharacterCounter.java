//Java 8 program to count the occurrences of a given character in a list of strings
package com.java8.stream;

import java.util.List;

public class CharacterCounter {
    public static long countCharacterOccurrences(List<String> strings, char targetChar) {
        return strings.stream()
                .flatMapToInt(CharSequence::chars)
                .filter(ch -> ch == targetChar)
                .count();
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry","grapes");
        char targetChar = 'a';
        long occurrences = countCharacterOccurrences(strings, targetChar);
        System.out.println("Occurrences of '" + targetChar + "': " + occurrences);
    }
}
