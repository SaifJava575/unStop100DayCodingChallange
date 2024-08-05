package com.unstop.day09;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FruitSumCalculatorTest {

    @Test
    public void testGetMinimumSumOfTheFruits() {
        // Test case 1: Regular case
        int[] arr1 = {3, 1, 2, 4};
        int n1 = 4;
        assertEquals(4, DY_09_ReenaFruits.getMinimumSumOfTheFruits(arr1, n1), "The minimum sum should be 3");

        // Test case 2: Array with one element
        int[] arr2 = {5};
        int n2 = 1;
        assertEquals(5, DY_09_ReenaFruits.getMinimumSumOfTheFruits(arr2, n2), "The minimum sum should be 5");

        // Test case 3: Array with even length
        int[] arr3 = {7, 2, 9, 4, 1, 6};
        int n3 = 6;
        assertEquals(12, DY_09_ReenaFruits.getMinimumSumOfTheFruits(arr3, n3), "The minimum sum should be 9");

        // Test case 4: Array with odd length
        int[] arr4 = {3, 8, 5, 1, 7};
        int n4 = 5;
        assertEquals(14, DY_09_ReenaFruits.getMinimumSumOfTheFruits(arr4, n4), "The minimum sum should be 8");

        // Test case 5: Array with all identical elements
        int[] arr5 = {4, 4, 4, 4, 4, 4};
        int n5 = 6;
        assertEquals(12, DY_09_ReenaFruits.getMinimumSumOfTheFruits(arr5, n5), "The minimum sum should be 12");
    }
}
