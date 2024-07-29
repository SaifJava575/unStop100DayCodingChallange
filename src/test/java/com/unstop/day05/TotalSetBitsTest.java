package com.unstop.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TotalSetBitsTest {

    @Test
    public void testSetBitsExample1() {
        int N = 5;
        long expected = 7;
        assertEquals(expected, DY_07_TotalSetBits.calculateTotalSetBits(N));
    }

    @Test
    public void testSetBitsExample2() {
        int N = 4;
        long expected = 5;
        assertEquals(expected, DY_07_TotalSetBits.calculateTotalSetBits(N));
    }

    @Test
    public void testSetBitsSingle() {
        int N = 1;
        long expected = 1;
        assertEquals(expected, DY_07_TotalSetBits.calculateTotalSetBits(N));
    }

    @Test
    public void testSetBitsLarger() {
        int N = 10;
        long expected = 17; // Binary: 1 (1), 2 (1), 3 (2), 4 (1), 5 (2), 6 (2), 7 (3), 8 (1), 9 (2), 10 (2)
        assertEquals(expected, DY_07_TotalSetBits.calculateTotalSetBits(N));
    }

    @Test
    public void testSetBitsZero() {
        int N = 0;
        long expected = 0;
        assertEquals(expected, DY_07_TotalSetBits.calculateTotalSetBits(N));
    }

    @Test
    public void testSetBitsMaxValue() {
        int N = 10000000;
        long expected = calculateSetBitsBruteForce(N); // This method should be defined to get expected result using brute-force method
        assertEquals(expected, DY_07_TotalSetBits.calculateTotalSetBits(N));
    }

    // Helper method to calculate the expected result using a brute-force approach
    private long calculateSetBitsBruteForce(int N) {
        long totalSetBits = 0;
        for (int i = 1; i <= N; i++) {
            totalSetBits += Integer.bitCount(i);
        }
        return totalSetBits;
    }
}
