package com.dsa.strings;

/**
 * String-based DSA problems
 */
public class StringProblems {

    /**
     * Check if a string is a palindrome
     * @param str input string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Reverse a string
     * @param str input string
     * @return reversed string
     */
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
