package com.miosman.dsa.recursion.problems;

public class TaylorSeries {
    /**
     * E^x = 1 + (x/1)  + (x^2/2!) + (x^3/3!) + (x^4/4!) ... n
     */

    private static double P = 1;
    private static double F = 1;

    private static double myFunc(int x, int n) {
        double R;

        if (n == 0) return 1;
        R = myFunc(x, n - 1);
        P = P * x;
        F = F * n;

        return R + P / F;


    }

    public static void main(String[] args) {

        System.out.println("result using recursion: " + myFunc(1, 10));
        P = 1;
        F = 1;
        System.out.println("result using recursion: " + myFunc(3, 10));

    }
}
