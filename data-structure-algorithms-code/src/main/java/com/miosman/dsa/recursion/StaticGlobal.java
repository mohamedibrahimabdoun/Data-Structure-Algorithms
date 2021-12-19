package com.miosman.dsa.recursion;


/**
 * This Class test the impact of global/static variables on recursion
 */
public class StaticGlobal {
    private static int STATIC_GLOBAL = 0;

    private static int recursion(int num) {
        if (num > 0) {
            return recursion(num - 1) + num;
        }
        return 0;
    }

    private static int recursionWithStaticVariable(int num) {

        if (num > 0) {
            STATIC_GLOBAL++;
            return recursionWithStaticVariable(num - 1) + STATIC_GLOBAL;
        }
        return 0;
    }


    public static void main(String[] args) {
        int x = 5;
        System.out.println("####### Executing  recursion without static/Global #######");
        System.out.println("first Result=" + recursion(x));
        System.out.println("Second Result=" + recursion(x));

        System.out.println("####### Executing  recursion using STATIC OR GLOBAL var #######");
        System.out.println("First Result=" + recursionWithStaticVariable(x));
        System.out.println("Second Result=" + recursionWithStaticVariable(x));


    }
}
