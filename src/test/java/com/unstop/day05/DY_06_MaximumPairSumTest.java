package com.unstop.day05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DY_06_MaximumPairSumTest {

    @Test
    public void testMaximumPairSum() {
        // Test case 1
        int[] arr1 = {2, 4, 5, 1};
        assertEquals(21, DY_06_MaximumPairSum.maximumPairSum(arr1, arr1.length));
        
        // Test case 2
        int[] arr2 = {1, 3, 2};
        assertEquals(7, DY_06_MaximumPairSum.maximumPairSum(arr2, arr2.length));
        
        // Test case 3
        int[] arr3 = {7, 8, 9, 5};
        assertEquals(73, DY_06_MaximumPairSum.maximumPairSum(arr3, arr3.length));
        
        // Test case 4
        int[] arr4 = {-1, -2, -3, -4};
        assertEquals(3, DY_06_MaximumPairSum.maximumPairSum(arr4, arr4.length));
        
        // Test case 5: Handling array with only two elements
        int[] arr5 = {1, 2};
        assertEquals(3, DY_06_MaximumPairSum.maximumPairSum(arr5, arr5.length));
        
        // Test case 6: Handling array with identical elements
        int[] arr6 = {3, 3, 3};
        assertEquals(9, DY_06_MaximumPairSum.maximumPairSum(arr6, arr6.length));
    }
}
