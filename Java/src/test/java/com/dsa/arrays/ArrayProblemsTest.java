package com.dsa.arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayProblemsTest {

    @Test
    public void testFindMax() {
        int[] arr = {1, 5, 3, 9, 2};
        assertEquals(9, ArrayProblems.findMax(arr));
    }

    @Test
    public void testFindSum() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, ArrayProblems.findSum(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArray() {
        ArrayProblems.findMax(new int[]{});
    }
}
