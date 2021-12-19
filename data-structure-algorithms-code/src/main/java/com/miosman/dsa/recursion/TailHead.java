package com.miosman.dsa.recursion;

public class TailHead {
    /**
     * Example for tail recursion where the recursive call is the last thing executed
     * Definition: https://www.geeksforgeeks.org/tail-recursion/
     */
    private static void printnumbertail(int num) {
        if (num > 0) {
            System.out.println(num);
            printnumbertail(num - 1);
        }
    }


    /**
     * Example for Head recursion where the recursive call is the first statement in the function
     */
    private static void printNumberHead(int num) {
        if (num > 0) {
            printNumberHead(num - 1);
            System.out.println(num);

        }
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println("####### Executing Tail recursion #######");
        printnumbertail(num);
        System.out.println("####### Executing Head recursion #######");
        printNumberHead(3);


    }
}
