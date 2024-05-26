//ava 8 program to check if given integer array contains duplicate or not.
// Return true if it contains duplicate character.
package com.java8.stream;

import java.util.Arrays;

public class DuplicateChecker {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,4, 5};
        System.out.println("Contains duplicates: " + containsDuplicates(nums));
    }

    public static boolean containsDuplicates(int[] nums) {
        return Arrays.stream(nums)
                .boxed() // Convert int[] to Stream<Integer>
                .distinct() // Remove duplicates
                .count() != nums.length; // Check if count is different from array length
    }
}
