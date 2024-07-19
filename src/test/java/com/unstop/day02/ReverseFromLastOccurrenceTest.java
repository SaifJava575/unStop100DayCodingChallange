package com.unstop.day02;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReverseFromLastOccurrenceTest {

    @Test
    public void testReverseFromLastOccurrence() {
        // Test case 1: Character is present
        String s1 = "abcdefgh";
        char ch1 = 'd';
        assertEquals("abchgfed", DY_04_ReverseFromLastOccurrence.reverseFromLastOccurrence(s1, ch1));

        // Test case 2: Character is at the end
        String s2 = "abcde";
        char ch2 = 'e';
        assertEquals("abcde", DY_04_ReverseFromLastOccurrence.reverseFromLastOccurrence(s2, ch2));

        // Test case 3: Character is at the beginning
        String s3 = "edcba";
        char ch3 = 'e';
        assertEquals("abcde", DY_04_ReverseFromLastOccurrence.reverseFromLastOccurrence(s3, ch3));

        // Test case 4: Character is not present
        String s4 = "abcdefgh";
        char ch4 = 'z';
        assertEquals("abcdefgh", DY_04_ReverseFromLastOccurrence.reverseFromLastOccurrence(s4, ch4));

        // Test case 5: String contains multiple occurrences of character
        String s5 = "abxcced";
        char ch5 = 'c';
        assertEquals("abxcdec", DY_04_ReverseFromLastOccurrence.reverseFromLastOccurrence(s5, ch5));

        // Test case 6: Single character string
        String s6 = "a";
        char ch6 = 'a';
        assertEquals("a", DY_04_ReverseFromLastOccurrence.reverseFromLastOccurrence(s6, ch6));

        // Test case 7: Empty string
        String s7 = "";
        char ch7 = 'a';
        assertEquals("", DY_04_ReverseFromLastOccurrence.reverseFromLastOccurrence(s7, ch7));
    }
}
