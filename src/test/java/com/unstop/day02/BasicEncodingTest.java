package com.unstop.day02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BasicEncodingTest {

    @Test
    public void testSingleQuery() {
        int[][] queries = {{2, 1}};
        int expectedOutput = 0;
        assertEquals(expectedOutput, DY_04_BasicEncoding.computeMaxAbsDifference(queries));
    }    

    @Test
    public void testTwoNumbersSameFrequency() {
        int[][] queries = {{1, 1}, {1, 2}};
        int expectedOutput = 0;
        assertEquals(expectedOutput, DY_04_BasicEncoding.computeMaxAbsDifference(queries));
    }

   

    @Test
    public void testNoQueries() {
        int[][] queries = {};
        int expectedOutput = 0;
        assertEquals(expectedOutput, DY_04_BasicEncoding.computeMaxAbsDifference(queries));
    }

    @Test
    public void testAllSameNumber() {
        int[][] queries = {{1, 1}, {1, 1}, {1, 1}};
        int expectedOutput = 0;
        assertEquals(expectedOutput, DY_04_BasicEncoding.computeMaxAbsDifference(queries));
    }
}
