package com.unstop.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ANDTripletsTest {

    @Test
    public void testCountANDTriplets() {
        // Test case 1: Sample input provided in the problem
        int[] arr1 = {1, 2};
        assertEquals(6, DY_05_ANDTriplets.countANDTriplets(arr1));

        // Test case 2: All zeros, all triplets will be zero
        int[] arr2 = {0, 0, 0};
        assertEquals(27, DY_05_ANDTriplets.countANDTriplets(arr2)); // 3^3 = 27

        // Test case 3: No triplet AND is zero
        int[] arr3 = {1, 3, 7};
        assertEquals(0, DY_05_ANDTriplets.countANDTriplets(arr3));

       
        // Test case 6: Single element array, should be zero as no valid triplet
        int[] arr6 = {1};
        assertEquals(0, DY_05_ANDTriplets.countANDTriplets(arr6));

        // Test case 7: All elements are 1
        int[] arr7 = {1, 1, 1, 1};
        assertEquals(0, DY_05_ANDTriplets.countANDTriplets(arr7));
       
        int[] arr8 = {2,1,3};
        assertEquals(12, DY_05_ANDTriplets.countANDTriplets(arr8));
       
    }
}
