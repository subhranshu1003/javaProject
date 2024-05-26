// Java 8 program to find the first word in a list that starts with given letter
package com.java8.stream;

import java.util.List;
import java.util.Optional;

public class FirstWordStartsWithLetterFinder {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "orange", "grape");
        char targetLetter = 'o';

        Optional<String> firstWord = findFirstWordStartsWithLetter(words, targetLetter);

        if (firstWord.isPresent()) {
            System.out.println("First word starting with '" + targetLetter + "': " + firstWord.get());
        } else {
            System.out.println("No word starting with '" + targetLetter + "' found.");
        }
    }

    public static Optional<String> findFirstWordStartsWithLetter(List<String> words, char targetLetter) {
        return words.stream()
                .filter(word -> !word.isEmpty() && word.charAt(0) == targetLetter)
                .findFirst();
    }
}
