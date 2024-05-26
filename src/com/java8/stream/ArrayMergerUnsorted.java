//Java 8 program to merge two unsorted arrays into single sorted array by removing duplicates
package com.java8.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMergerUnsorted {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 6, 1};
        int[] arr2 = {7, 3, 5, 8};

        int[] mergedArray = mergeAndSortArraysWithoutDuplicates(arr1, arr2);

        System.out.println("Merged and sorted array without duplicates: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeAndSortArraysWithoutDuplicates(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
// Concatenate both arrays into a single stream
                .distinct() // Remove duplicates
                .sorted() // Sort the elements of the stream
                .toArray(); // Convert the sorted stream to an array
    }
}
