package com.miosman.dsa.recursion.problems;

public class FibonacciSeriesUsingMemoization {
    // private static int[] memArray = new int[10];
    private static int[] memArray;

    /**
     * O(n)
     */
    private static int fibUsingIteration(int n) {
        int t0 = 0;
        int t1 = 1;
        int s = 0;
        int i;
        if (n <= 1) return n;

        for (i = 2; i <= n; i++) {
            s = t0 + t1;
            t0 = t1;
            t1 = s;
        }

        return s;
    }

    /**
     * O(2^n)
     */
    private static int fibUsingExcessiveRecursion(int n) {
        if (n <= 1) return n;
        return fibUsingExcessiveRecursion(n - 2) + fibUsingExcessiveRecursion(n - 1);

    }

    /**
     * O(n)
     */
    private static int fibRecusrionWithMemoization(int n) {
        if (n <= 1) {
            memArray[n] = n;
            return n;
        } else {
            if (memArray[n - 2] == -1) {
                memArray[n - 2] = fibRecusrionWithMemoization(n - 2);

            }
            if (memArray[n - 1] == -1) {
                memArray[n - 1] = fibRecusrionWithMemoization(n - 1);

            }
            return memArray[n - 2] + memArray[n - 1];
        }


    }

    public static void main(String[] args) {

        int input = 6;

        System.out.println("result using iteration: " + fibUsingIteration(input));

        System.out.println("result using Excessive Recursion: " + fibUsingExcessiveRecursion(input));

        memArray = new int[input];
        for (int i = 0; i < memArray.length; i++) memArray[i] = -1;

        System.out.println("result using  Memoization: " + fibRecusrionWithMemoization(input));

    }
}
