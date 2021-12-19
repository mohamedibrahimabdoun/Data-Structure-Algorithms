package com.miosman.dsa.recursion;

public class NestedRecursion {

    private static int func(int num) {
        if (num > 100) {
            return num - 10;
        } else {
            return func(func(num + 11));
        }
    }

    public static void main(String[] args) {
        int x = 95;
        System.out.println(func(x));

    }
}
