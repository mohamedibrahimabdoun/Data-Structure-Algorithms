package com.miosman.dsa.recursion.problems;

public class ExponentofNumber {

    private static int powerFunc(int num, int powr) {

        if (powr == 0) return 1;

        return powerFunc(num, powr - 1) * num;

    }

    /**
     * with reduced number of multiplication
     */
    private static int powerFuncWithLessExecution(int num, int powr) {

        if (powr == 0) return 1;

        if (powr % 2 == 0) {
            return powerFuncWithLessExecution(num * num, powr / 2);
        }
        return num * powerFuncWithLessExecution(num * num, powr - 1);

    }

    public static void main(String[] args) {

        System.out.println("Result using recursion: " + powerFunc(3, 4));
        System.out.println("Result using recursion: " + powerFuncWithLessExecution(3, 4));
    }
}
