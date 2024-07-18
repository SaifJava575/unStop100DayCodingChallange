package com.unstop.day02;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GoodPuddingTest {

    @Test
    public void testGoodPuddingApproach() {
        List<Integer> input = Arrays.asList(1010, 2123, 9004);
        int[] expectedOutput = {0, 1, 1};
        assertArrayEquals(expectedOutput, GoodPudding.goodPuddingApproach(input));
    }
    
    @Test
    public void testAllGoodPuddings() {
        List<Integer> input = Arrays.asList(111, 222, 333);
        int[] expectedOutput = {1, 1, 1};
        assertArrayEquals(expectedOutput, GoodPudding.goodPuddingApproach(input));
    }

    @Test
    public void testAllBadPuddings() {
        List<Integer> input = Arrays.asList(10, 20, 30);
        int[] expectedOutput = {0, 0, 0};
        assertArrayEquals(expectedOutput, GoodPudding.goodPuddingApproach(input));
    }

    @Test
    public void testMixedPuddings() {
        List<Integer> input = Arrays.asList(123, 1001, 540);
        int[] expectedOutput = {1, 1, 0};
        assertArrayEquals(expectedOutput, GoodPudding.goodPuddingApproach(input));
    }

    @Test
    public void testEmptyList() {
        List<Integer> input = Arrays.asList();
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput, GoodPudding.goodPuddingApproach(input));
    }
}
