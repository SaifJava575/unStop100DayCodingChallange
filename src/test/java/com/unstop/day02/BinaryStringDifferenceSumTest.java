package com.unstop.day02;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BinaryStringDifferenceSumTest {

    @Test
    public void testFindTotalSum() {
        // Test case 1: Basic test
        String a1 = "110";
        String b1 = "110110";
        assertEquals(4, DY_03_BinaryStringDifferenceSum.findTotalSum(a1, b1));

        // Test case 2: No differences
        String a2 = "101";
        String b2 = "101101";
        assertEquals(4, DY_03_BinaryStringDifferenceSum.findTotalSum(a2, b2));

      
        // Test case 4: Single character strings
        String a4 = "1";
        String b4 = "111";
        assertEquals(0, DY_03_BinaryStringDifferenceSum.findTotalSum(a4, b4));

        String a5 = "1";
        String b5 = "000";
        assertEquals(3, DY_03_BinaryStringDifferenceSum.findTotalSum(a5, b5));

        // Test case 5: Mixed differences
        String a6 = "101";
        String b6 = "100101";
        assertEquals(5, DY_03_BinaryStringDifferenceSum.findTotalSum(a6, b6));
    }

    @Test
    public void testCountDifferences() {
        // Test case 1: No differences
        String a1 = "110";
        String b1 = "110";
        assertEquals(0, DY_03_BinaryStringDifferenceSum.countDifferences(a1, b1));

        // Test case 2: All differences
        String a2 = "111";
        String b2 = "000";
        assertEquals(3, DY_03_BinaryStringDifferenceSum.countDifferences(a2, b2));

        // Test case 3: Some differences
        String a3 = "101";
        String b3 = "100";
        assertEquals(1, DY_03_BinaryStringDifferenceSum.countDifferences(a3, b3));

        // Test case 4: Single character strings, no difference
        String a4 = "1";
        String b4 = "1";
        assertEquals(0, DY_03_BinaryStringDifferenceSum.countDifferences(a4, b4));

        // Test case 5: Single character strings, different
        String a5 = "1";
        String b5 = "0";
        assertEquals(1, DY_03_BinaryStringDifferenceSum.countDifferences(a5, b5));
    }
}
