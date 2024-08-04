package com.unstop.day09;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ChainOfBoxesTest {

    @Test
    public void testReverseOrderOfArrays() {
        // Given
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5; // The number of elements to reverse from the end

        // When
        int[] result = DY_09_ChainOfBoxes.reverseOrderOfArrays(arr, n);

        // Then
        int[] expected = {5,4,3,2,1};
        assertArrayEquals(expected, result, "The array should be reversed correctly.");
    }

    @Test
    public void testReverseOrderOfArraysEmptyArray() {
        // Given
        int[] arr = {};
        int n = 0; // No elements to reverse

        // When
        int[] result = DY_09_ChainOfBoxes.reverseOrderOfArrays(arr, n);

        // Then
        int[] expected = {};
        assertArrayEquals(expected, result, "The result should be an empty array.");
    }

    @Test
    public void testReverseOrderOfArraysFullArray() {
        // Given
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length; // Reverse the entire array

        // When
        int[] result = DY_09_ChainOfBoxes.reverseOrderOfArrays(arr, n);

        // Then
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, result, "The entire array should be reversed.");
    }

    @Test
    public void testReverseOrderOfArraysSingleElement() {
        // Given
        int[] arr = {1};
        int n = 1; // Single element array

        // When
        int[] result = DY_09_ChainOfBoxes.reverseOrderOfArrays(arr, n);

        // Then
        int[] expected = {1};
        assertArrayEquals(expected, result, "A single element array should remain unchanged.");
    }

    @Test
    public void testReverseOrderOfArraysMoreThanLength() {
        // Given
        int[] arr = {1, 2, 3};
        int n = 3; // More than the length of the array

        // When
        int[] result = DY_09_ChainOfBoxes.reverseOrderOfArrays(arr, n);

        // Then
        int[] expected = {3, 2, 1}; // Reverse the entire array
        assertArrayEquals(expected, result, "Reversing more than the length of the array should reverse the whole array.");
    }
}
