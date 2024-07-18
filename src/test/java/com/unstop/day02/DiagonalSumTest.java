package com.unstop.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiagonalSumTest {

    @Test
    public void testEvenNumber() {
        assertEquals(4, DY_03_DiagonalSum.diagonalSum(2));
        assertEquals(8, DY_03_DiagonalSum.diagonalSum(4));
        assertEquals(12, DY_03_DiagonalSum.diagonalSum(6));
    }

    @Test
    public void testOddNumber() {
        assertEquals(1, DY_03_DiagonalSum.diagonalSum(1));
        assertEquals(5, DY_03_DiagonalSum.diagonalSum(3));
        assertEquals(9, DY_03_DiagonalSum.diagonalSum(5));
    }

    @Test
    public void testZero() {
        assertEquals(0, DY_03_DiagonalSum.diagonalSum(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertEquals(-4, DY_03_DiagonalSum.diagonalSum(-2));
        assertEquals(-8, DY_03_DiagonalSum.diagonalSum(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        assertEquals(-5, DY_03_DiagonalSum.diagonalSum(-3));
        assertEquals(-9, DY_03_DiagonalSum.diagonalSum(-5));
    }
}
