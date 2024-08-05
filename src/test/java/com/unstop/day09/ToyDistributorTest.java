package com.unstop.day09;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ToyDistributorTest {

    @Test
    public void testListOfToys() {
        // Test case 1: Regular case
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int n1 = 3;
        int[] expected1 = {1, 4, 2, 5, 3, 6};
        assertArrayEquals(expected1, DY_10_ListOfToys.listOfToys(arr1, n1), "The order should be {1, 4, 2, 5, 3, 6}");

        // Test case 2: n equals array length
        int[] arr2 = {7, 8, 9, 10};
        int n2 = 4;
        int[] expected2 = {7, 0, 8, 0, 9, 0, 10, 0};
        assertArrayEquals(expected2, DY_10_ListOfToys.listOfToys(arr2, n2), "The order should be {7, 0, 8, 0, 9, 0, 10, 0}");

        // Test case 3: n is 0
        int[] arr3 = {11, 12, 13, 14};
        int n3 = 0;
        int[] expected3 = {0, 11, 0, 12, 0, 13, 0, 14};
        assertArrayEquals(expected3, DY_10_ListOfToys.listOfToys(arr3, n3), "The order should be {0, 11, 0, 12, 0, 13, 0, 14}");

        // Test case 4: n equals 1
        int[] arr4 = {15, 16, 17, 18};
        int n4 = 1;
        int[] expected4 = {15, 16, 0, 17, 0, 18};
        assertArrayEquals(expected4, DY_10_ListOfToys.listOfToys(arr4, n4), "The order should be {15, 16, 0, 17, 0, 18}");

        // Test case 5: Array with all identical elements
       /* int[] arr5 = {5, 5, 5, 5, 5, 5};
        int n5 = 3;
        int[] expected5 = {5, 5, 5, 5, 5, 5};
        assertArrayEquals(expected5, DY_10_ListOfToys.listOfToys(arr5, n5), "The order should be {5, 5, 5, 5, 5, 5}");*/
    }
}
