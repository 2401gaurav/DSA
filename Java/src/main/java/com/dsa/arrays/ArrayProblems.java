package com.dsa.arrays;

/**
 * Array-based DSA problems
 */
public class ArrayProblems {

    /**
     * Find the maximum element in an array
     * @param arr input array
     * @return maximum element
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Find the sum of all elements in an array
     * @param arr input array
     * @return sum of all elements
     */
    public static long findSum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
