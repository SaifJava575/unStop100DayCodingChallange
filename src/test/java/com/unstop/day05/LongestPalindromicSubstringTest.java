package com.unstop.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindromicSubstringLength() {
        assertEquals(3, DY_05_LongestPalindromicSubstring.longestPalindromicSubstringLength("abacc"));
        assertEquals(2, DY_05_LongestPalindromicSubstring.longestPalindromicSubstringLength("bb"));
        assertEquals(4, DY_05_LongestPalindromicSubstring.longestPalindromicSubstringLength("abba"));
        assertEquals(1, DY_05_LongestPalindromicSubstring.longestPalindromicSubstringLength("abcd"));
        assertEquals(7, DY_05_LongestPalindromicSubstring.longestPalindromicSubstringLength("racecar"));
        assertEquals(5, DY_05_LongestPalindromicSubstring.longestPalindromicSubstringLength("babab"));
    }
}
