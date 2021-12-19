package com.miosman.dsa.recursion;

/**
 *
 */
public class TreeRecursion {

private static void treeRecursionExample(int num) {
    if (num > 0) {
        System.out.print(num + " -> ");
        treeRecursionExample(num-1);
        treeRecursionExample(num-1);
    }

}
    public static void main(String[] args) {

        int num = 3;
        System.out.println("####### Executing Tree recursion #######");
        treeRecursionExample(num);

    }
}
