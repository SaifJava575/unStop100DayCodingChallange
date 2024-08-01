package com.unstop.day05;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class JohnWickEscapeTest {
    

    @Test
    public void testEscapePlanEvenLength() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        Arrays.sort(arr);
        int result = DY_08_EscapePlan.escapePlan(arr, n);
        assertEquals(7, result);  // 3 + 4=7
        
        int[] arr1 = {10};
        int n1= arr1.length;
        int result1 = DY_08_EscapePlan.escapePlan(arr1, n1);
        assertEquals(10, result1);//10
        
        int[] arr2 = {20, 10};
        int n2 = arr2.length;
        Arrays.sort(arr2);
        int result2 = DY_08_EscapePlan.escapePlan(arr2, n2);
        assertEquals(30, result2);  // 10 + 20
        
        int[] arr3 = {1, 2, 3, 4, 5};
        int n3 = arr3.length;
        Arrays.sort(arr3);
        int result3 = DY_08_EscapePlan.escapePlan(arr3, n3);
        assertEquals(3, result3);  // 3 
    }

   
}
