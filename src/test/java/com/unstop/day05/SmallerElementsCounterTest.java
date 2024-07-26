package com.unstop.day05;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmallerElementsCounterTest {

    @Test
    public void testCountSmallerElements() {
        // Test case 1: Given sample testcase
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, DY_06_SmallerElementsCounter.countSmallerElements(new int[]{8, 1, 2, 2, 3}));

        // Test case 2: All elements are the same
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, DY_06_SmallerElementsCounter.countSmallerElements(new int[]{5, 5, 5, 5, 5}));

        // Test case 3: Elements in ascending order
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, DY_06_SmallerElementsCounter.countSmallerElements(new int[]{1, 2, 3, 4, 5}));

        // Test case 4: Elements in descending order
        assertArrayEquals(new int[]{4, 3, 2, 1, 0}, DY_06_SmallerElementsCounter.countSmallerElements(new int[]{5, 4, 3, 2, 1}));

        // Test case 5: Random order with duplicates
        assertArrayEquals(new int[]{4, 1, 2, 2, 0, 5}, DY_06_SmallerElementsCounter.countSmallerElements(new int[]{6, 2, 5, 5, 1, 10}));

        // Test case 6: Single element
        assertArrayEquals(new int[]{0}, DY_06_SmallerElementsCounter.countSmallerElements(new int[]{42}));

        // Test case 7: Large numbers
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, DY_06_SmallerElementsCounter.countSmallerElements(new int[]{100, 10, 20, 20, 30}));
    }
}
