package com.java8.functionalInterace;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression to implement the MathOperation interface
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Result of addition: " + addition.operate(5, 3));

        // Example 2: Using a method reference to implement the MathOperation interface
        MathOperation subtraction = FunctionalInterfaceExample::subtract;
        System.out.println("Result of subtraction: " + subtraction.operate(5, 3));
    }

    // Method referenced by the subtraction functional interface
    public static int subtract(int a, int b) {
        return a - b;
    }
}
