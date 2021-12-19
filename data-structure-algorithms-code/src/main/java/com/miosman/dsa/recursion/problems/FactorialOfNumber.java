package com.miosman.dsa.recursion.problems;

public class FactorialOfNumber {

    private static int factorialUsingRecursion(int num) {
        //this to avoid stack overflow
        if (num < 0) {
            return 0;
        }

        if (num == 0) {
            return 1;
        }

        return factorialUsingRecursion(num - 1) * num;

    }

    private static int factorialUsingiteration(int num) {

        //this to avoid stack overflow
        if (num < 0) {
            return 0;
        }

        if (num == 0) {
            return 1;
        }

        int result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Result using recursion: " + factorialUsingRecursion(x));

        System.out.println("Result using iteration: " + factorialUsingiteration(x));

    }
}
