package com.unstop.day05;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarathonCityTest {
    
    @Test
    public void testSampleTestCase0() {
        String input = "5\n2 3\n-1 -1\n4 5\n-1 -1\n-1 -1\n";
        int expectedOutput = 3;
        assertEquals(expectedOutput, runMarathonCity(input));
    }

    @Test
    public void testSingleNode() {
        String input = "1\n-1 -1\n";
        int expectedOutput = 0;
        assertEquals(expectedOutput, runMarathonCity(input));
    }

    @Test
    public void testLineTree() {
        String input = "4\n2 -1\n3 -1\n4 -1\n-1 -1\n";
        int expectedOutput = 3;
        assertEquals(expectedOutput, runMarathonCity(input));
    }

    @Test
    public void testBalancedTree() {
        String input = "7\n2 3\n4 5\n6 7\n-1 -1\n-1 -1\n-1 -1\n-1 -1\n";
        int expectedOutput = 4;
        assertEquals(expectedOutput, runMarathonCity(input));
    }

    private int runMarathonCity(String input) {
        // Redirect input and output streams for testing
        java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // Run the main method
        DY_07_MarathonCity.main(new String[]{});

        // Get the output
        String result = out.toString().trim();
        return Integer.parseInt(result);
    }
}
