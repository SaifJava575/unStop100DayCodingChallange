package com.unstop.day01;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FrequencyDifferenceTest {

    private FrequencyDifference frequencyDifference;

    @BeforeEach
    public void setUp() {
        frequencyDifference = new FrequencyDifference();
    }

    @Test
    public void testMaxAbsoluteDifference() {
        int[][] queries = {
            {3, 5},
            {2, 1},
            {5, 3},
            {1, 5},
            {3, 1},
            {1, 3}
        };

        frequencyDifference.processQueries(queries);
        int result = frequencyDifference.getMaxAbsoluteDifference();
        assertEquals(2, result, "The max absolute difference should be 2");
    }

    @Test
    public void testMaxAbsoluteDifferenceWithSingleQuery() {
        int[][] queries = {
            {3, 5}
        };

        frequencyDifference.processQueries(queries);
        int result = frequencyDifference.getMaxAbsoluteDifference();
        assertEquals(0, result, "The max absolute difference with a single query should be 0");
    }

    @Test
    public void testMaxAbsoluteDifferenceWithMultipleFrequencies() {
        int[][] queries = {
            {1, 1},
            {2, 2},
            {3, 3},
            {4, 4},
            {5, 5}
        };

        frequencyDifference.processQueries(queries);
        int result = frequencyDifference.getMaxAbsoluteDifference();
        assertEquals(4, result, "The max absolute difference should be 4");
    }

    @Test
    public void testMaxAbsoluteDifferenceWithEmptyQueries() {
        int[][] queries = {};

        frequencyDifference.processQueries(queries);
        int result = frequencyDifference.getMaxAbsoluteDifference();
        assertEquals(0, result, "The max absolute difference with empty queries should be 0");
    }
}
