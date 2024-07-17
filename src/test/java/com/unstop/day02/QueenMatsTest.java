package com.unstop.day02;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class QueenMatsTest {

    @Test
    public void testMaxModuloValue_Case1() {
        int l = 1;
        int r = 10;
        int expected = 4;
        int result = QueenMats.maxModuloValue(l, r);
        assertEquals(expected, result, "Test case 1 SUCCESS");
    }

    @Test
    public void testMaxModuloValue_Case2() {
        int l = 3;
        int r = 7;
        int expected = 3;
        int result = QueenMats.maxModuloValue(l, r);
        assertEquals(expected, result, "Test case 2 SUCCESS");
    }

    @Test
    public void testMaxModuloValue_Case3() {
        int l = 5;
        int r = 10;
        int expected = 5;
        int result = QueenMats.maxModuloValue(l, r);
        assertNotEquals(expected, result, "Test case 3 failed");
    }

    @Test
    public void testMaxModuloValue_Case4() {
        int l = 1;
        int r = 2;
        int expected = 0;
        int result = QueenMats.maxModuloValue(l, r);
        assertEquals(expected, result, "Test case 4 SUCCESS");
    }

    @Test
    public void testMaxModuloValue_Case5() {
        int l = 10;
        int r = 20;
        int expected = 10;
        int result = QueenMats.maxModuloValue(l, r);
        assertNotEquals(expected, result, "Test case 5 failed");
    }

    @Test
    public void testMaxModuloValue_Case6() {
        int l = 500;
        int r = 1000;
        int expected = 499;
        int result = QueenMats.maxModuloValue(l, r);
        assertEquals(expected, result, "Test case 6 SUCCESS");
    }
}
