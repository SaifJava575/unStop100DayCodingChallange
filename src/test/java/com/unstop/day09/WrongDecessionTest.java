package com.unstop.day09;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WrongDecessionTest {

    @Test
    public void testFirstWrongDecisionWithWPresent() {
        // Given
        String str = "ABCDWXYZ";

        // When
        int result = DY_09_FirstWrongDecssion.firstWrongDecession(str);

        // Then
        assertEquals(4, result, "The index of the first 'W' should be 4.");
    }

    @Test
    public void testFirstWrongDecisionWithWAbsent() {
        // Given
        String str = "ABCDEF";

        // When
        int result = DY_09_FirstWrongDecssion.firstWrongDecession(str);

        // Then
        assertEquals(-1, result, "If 'W' is not present, the result should be -1.");
    }

    @Test
    public void testFirstWrongDecisionWithWAtBeginning() {
        // Given
        String str = "WXYZ";

        // When
        int result = DY_09_FirstWrongDecssion.firstWrongDecession(str);

        // Then
        assertEquals(0, result, "The index of the first 'W' should be 0 when 'W' is at the beginning.");
    }

    @Test
    public void testFirstWrongDecisionWithWAtEnd() {
        // Given
        String str = "XYZW";

        // When
        int result = DY_09_FirstWrongDecssion.firstWrongDecession(str);

        // Then
        assertEquals(3, result, "The index of the first 'W' should be 3 when 'W' is at the end.");
    }

    @Test
    public void testFirstWrongDecisionWithEmptyString() {
        // Given
        String str = "";

        // When
        int result = DY_09_FirstWrongDecssion.firstWrongDecession(str);

        // Then
        assertEquals(-1, result, "The result should be -1 for an empty string.");
    }

    @Test
    public void testFirstWrongDecisionWithOnlyW() {
        // Given
        String str = "W";

        // When
        int result = DY_09_FirstWrongDecssion.firstWrongDecession(str);

        // Then
        assertEquals(0, result, "The index of 'W' should be 0 for a single character string with 'W'.");
    }

    @Test
    public void testFirstWrongDecisionWithMultipleW() {
        // Given
        String str = "ABCDEWFGHW";

        // When
        int result = DY_09_FirstWrongDecssion.firstWrongDecession(str);

        // Then
        assertEquals(5, result, "The index of the first 'W' should be 5 when there are multiple 'W's.");
    }
}
