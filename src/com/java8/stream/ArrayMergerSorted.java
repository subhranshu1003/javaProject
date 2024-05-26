//Java 8 program to merge two unsorted arrays into single sorted array
package com.java8.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMergerSorted {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 8, 10, 10};
        int[] arr2 = {1, 2, 4, 5};

        int[] mergedArray = mergeAndSortArrays(arr1, arr2);

        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();
    }
}
