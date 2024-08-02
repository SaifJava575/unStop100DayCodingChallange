package com.unstop.day09;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class EnchantedCompartmentsTest {

    @Test
    public void testCountWays() {
        assertEquals(1, DY_09_EnchantedCompartments.countWays(1));
        assertEquals(2, DY_09_EnchantedCompartments.countWays(2));
        assertEquals(3, DY_09_EnchantedCompartments.countWays(3));
        assertEquals(5, DY_09_EnchantedCompartments.countWays(4));
        assertEquals(8, DY_09_EnchantedCompartments.countWays(5));
        assertEquals(13, DY_09_EnchantedCompartments.countWays(6));
        assertEquals(21, DY_09_EnchantedCompartments.countWays(7));
        assertEquals(34, DY_09_EnchantedCompartments.countWays(8));
        assertEquals(55, DY_09_EnchantedCompartments.countWays(9));
        assertEquals(89, DY_09_EnchantedCompartments.countWays(10));
        // Add more test cases if needed
    }

    @Test
    public void testCountWaysBoundary() {
        assertEquals(1, DY_09_EnchantedCompartments.countWays(0)); // Edge case: 0 compartments
        assertEquals(1836311903, DY_09_EnchantedCompartments.countWays(45)); // Max case: 45 compartments
    }
}
