package com.unstop.day02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BoxAbPatterTest {

    @Test
    public void testSingleCharacterString() {
        assertEquals("YES", DY_04_Box_AB_Pattern.boxAbPatter("aaaaab"));
    }

    @Test
    public void testTwoDifferentCharacters() {
        assertEquals("NO", DY_04_Box_AB_Pattern.boxAbPatter("aaba"));
    }

    @Test
    public void testTwoSameCharacters() {
        assertEquals("YES", DY_04_Box_AB_Pattern.boxAbPatter("aa"));
    }

    @Test
    public void testThreeSameCharacters() {
        assertEquals("YES", DY_04_Box_AB_Pattern.boxAbPatter("aaa"));
    }

    @Test
    public void testThreeDifferentCharacters() {
        assertEquals("NO", DY_04_Box_AB_Pattern.boxAbPatter("abc"));
    }

    @Test
    public void testAlternatingCharacters() {
        assertEquals("NO", DY_04_Box_AB_Pattern.boxAbPatter("abab"));
    }

    @Test
    public void testAllDifferentCharacters() {
        assertEquals("NO", DY_04_Box_AB_Pattern.boxAbPatter("abcdef"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("YES", DY_04_Box_AB_Pattern.boxAbPatter(""));
    }
}
