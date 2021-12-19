package com.miosman.dsa.recursion;

public class IndirectRecursion {

    private static void function01(int num) {
        if (num > 0) {
            System.out.print(num + " ");
            function02(num - 1);
        }

    }

    private static void function02(int num) {
        if (num > 1) {
            System.out.print(num  + " ");
            function01(num / 2);
        }

    }

    public static void main(String[] args) {
        int x = 20;
        function01(x);

    }
}
