package com.dsa.strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringProblemsTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(StringProblems.isPalindrome("racecar"));
        assertTrue(StringProblems.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(StringProblems.isPalindrome("hello"));
    }

    @Test
    public void testReverseString() {
        assertEquals("olleh", StringProblems.reverseString("hello"));
        assertEquals("", StringProblems.reverseString(""));
    }
}
