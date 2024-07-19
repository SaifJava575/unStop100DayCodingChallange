package com.unstop.day02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
public class AlienDictionarySegmenterTest {

    @Test
    public void testCanBeSegmented() {
        // Test case 1: Basic test with a simple segmentation
        String s1 = "applepenapple";
        Set<String> dictionary1 = new HashSet<>();
        dictionary1.add("apple");
        dictionary1.add("pen");
        assertTrue(DY_03_AlienDictionarySegmenter.canBeSegmented(s1, dictionary1));

        // Test case 2: String cannot be segmented
        String s2 = "catsandog";
        Set<String> dictionary2 = new HashSet<>();
        dictionary2.add("cats");
        dictionary2.add("dog");
        dictionary2.add("sand");
        dictionary2.add("and");
        dictionary2.add("cat");
        assertFalse(DY_03_AlienDictionarySegmenter.canBeSegmented(s2, dictionary2));

        // Test case 3: Empty string should return true
        String s3 = "";
        Set<String> dictionary3 = new HashSet<>();
        dictionary3.add("a");
        assertTrue(DY_03_AlienDictionarySegmenter.canBeSegmented(s3, dictionary3));

        // Test case 4: Single character string present in the dictionary
        String s4 = "a";
        Set<String> dictionary4 = new HashSet<>();
        dictionary4.add("a");
        assertTrue(DY_03_AlienDictionarySegmenter.canBeSegmented(s4, dictionary4));

        // Test case 5: Single character string not present in the dictionary
        String s5 = "b";
        Set<String> dictionary5 = new HashSet<>();
        dictionary5.add("a");
        assertFalse(DY_03_AlienDictionarySegmenter.canBeSegmented(s5, dictionary5));

        // Test case 6: Long string with multiple segmentations possible
        String s6 = "catsanddogs";
        Set<String> dictionary6 = new HashSet<>();
        dictionary6.add("cats");
        dictionary6.add("and");
        dictionary6.add("dogs");
        assertTrue(DY_03_AlienDictionarySegmenter.canBeSegmented(s6, dictionary6));
    }
}
