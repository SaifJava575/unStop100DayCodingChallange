package com.unstop.day02;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RepeatingBoxTest {

    @Test
    public void testNoRepetition() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        assertEquals(0, DY_04_ReaptingBox.repetedNumberOfTheBox(arr, n));
    }

    @Test
    public void testSingleRepetition() {
        int[] arr = {1, 2, 3, 4, 5, 3};
        int n = arr.length;
        assertEquals(3, DY_04_ReaptingBox.repetedNumberOfTheBox(arr, n));
    }

    @Test
    public void testMultipleRepetitions() {
        int[] arr = {1, 2, 3, 4, 5, 3, 2};
        int n = arr.length;
        assertEquals(3, DY_04_ReaptingBox.repetedNumberOfTheBox(arr, n));
    }

    @Test
    public void testMultipleRepetitionsLastOccurrence() {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 2};
        int n = arr.length;
        assertEquals(3, DY_04_ReaptingBox.repetedNumberOfTheBox(arr, n));
    }

    @Test
    public void testAllSameElements() {
        int[] arr = {2, 2, 2, 2, 2};
        int n = arr.length;
        assertEquals(2, DY_04_ReaptingBox.repetedNumberOfTheBox(arr, n));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int n = arr.length;
        assertEquals(0, DY_04_ReaptingBox.repetedNumberOfTheBox(arr, n));
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {1};
        int n = arr.length;
        assertEquals(0, DY_04_ReaptingBox.repetedNumberOfTheBox(arr, n));
    }
}
