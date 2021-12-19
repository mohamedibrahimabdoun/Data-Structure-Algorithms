package com.miosman.dsa.recursion.problems;

public class SumOfNaturalNumber {

    private static int sumUsingRecursion(int num) {

        if (num == 0) {
            return 0;
        } else {
            return sumUsingRecursion(num - 1) + num;
        }
    }


    private static int sumUsingiteration(int num) {

        int s = 0;
        int i;

        for (i = 1; i <= num; i++) {
            s = s + i;
        }
        return s;
    }


    private static int sumMathmitically(int num) {
        return num * (num + 1) / 2;

    }

    public static void main(String[] args) {
        int x = 5;

        System.out.println("result using recursion: " + sumUsingRecursion(x));

        System.out.println("result using iteration: " + sumUsingiteration(x));

        System.out.println("result using Math: " + sumMathmitically(x));

    }
}
