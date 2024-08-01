package com.unstop.day05;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AliceCleanHomeTest {

    @Test
    public void testAliceCleanHomeNoZeros() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Call the method and get the result
        int[] result = DY_08_AliceCleanHome.aliceCleanHome(arr, n);

        // Expected output should be the same array since there are no zeros
        int[] expected = {1, 2, 3, 4, 5};

        // Verify the output
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAliceCleanHomeWithZeros() {
        int[] arr = {1, 0, 3, 0, 5};
        int n = arr.length;

        // Call the method and get the result
        int[] result = DY_08_AliceCleanHome.aliceCleanHome(arr, n);

        // Expected output should have zeros moved to the end
        int[] expected = {1, 3, 5, 0, 0};

        // Verify the output
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAliceCleanHomeAllZeros() {
        int[] arr = {0, 0, 0, 0, 0};
        int n = arr.length;

        // Call the method and get the result
        int[] result = DY_08_AliceCleanHome.aliceCleanHome(arr, n);

        // Expected output should be the same array since all elements are zeros
        int[] expected = {0, 0, 0, 0, 0};

        // Verify the output
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAliceCleanHomeMixedZerosAndNonZeros() {
        int[] arr = {0, 1, 0, 2, 0, 3, 0};
        int n = arr.length;

        // Call the method and get the result
        int[] result = DY_08_AliceCleanHome.aliceCleanHome(arr, n);

        // Expected output should have zeros moved to the end
        int[] expected = {1, 2, 3, 0, 0, 0, 0};

        // Verify the output
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAliceCleanHomeSingleElement() {
        int[] arr = {1};
        int n = arr.length;

        // Call the method and get the result
        int[] result = DY_08_AliceCleanHome.aliceCleanHome(arr, n);

        // Expected output should be the same array since it has only one element
        int[] expected = {1};

        // Verify the output
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAliceCleanHomeSingleZero() {
        int[] arr = {0};
        int n = arr.length;

        // Call the method and get the result
        int[] result = DY_08_AliceCleanHome.aliceCleanHome(arr, n);

        // Expected output should be the same array since it has only one element which is zero
        int[] expected = {0};

        // Verify the output
        assertArrayEquals(expected, result);
    }
}
