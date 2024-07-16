package com.unstop.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CityBikerTestCase {

	
	 @Test
	    public void testFindHighestAltitude() {
	        // Test case 1
	        int[] gain1 = {-5, 1, 5, 0, -7};
	        assertEquals(1, CityBiker.findHighestAltitude(gain1));

	        // Test case 2
	        int[] gain2 = {4, -4, 3, 2};
	        assertEquals(5, CityBiker.findHighestAltitude(gain2));

	        // Test case 3
	        int[] gain3 = {0, 0, 0, 0};
	        assertEquals(0, CityBiker.findHighestAltitude(gain3));

	        // Test case 4
	        int[] gain4 = {10, -2, -8, 5, -3, 4};
	        assertEquals(10, CityBiker.findHighestAltitude(gain4));

	        // Test case 5
	        int[] gain5 = {-1, -2, -3, -4};
	        assertEquals(0, CityBiker.findHighestAltitude(gain5));

	        // Test case 6
	        int[] gain6 = {5, 4, -1, 2, -3, 1};
	        assertEquals(10, CityBiker.findHighestAltitude(gain6));
	    }
}
