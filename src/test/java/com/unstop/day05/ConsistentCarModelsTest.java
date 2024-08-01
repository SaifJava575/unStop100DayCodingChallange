package com.unstop.day05;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConsistentCarModelsTest {

    @Test
    public void testConsistentCarModels1() {
        String components1 = "emta";
        String[] models1 = {"etmb", "e", "et", "eam", "mtb", "akm"};
        int n1 = 6;
        int expected1 = 3;
        assertEquals(expected1, DY_07_ConsistentCarModels.consistentCarModels1(components1, models1, n1));

        String components2 = "abc";
        String[] models2 = {"a", "b", "c", "ab", "bc", "abc", "abcd"};
        int n2 = 7;
        int expected2 = 6;
        assertEquals(expected2, DY_07_ConsistentCarModels.consistentCarModels1(components2, models2, n2));

        String components3 = "xyz";
        String[] models3 = {"x", "xy", "xyz", "yz", "z", "yx"};
        int n3 = 6;
        int expected3 = 6;
        assertEquals(expected3, DY_07_ConsistentCarModels.consistentCarModels1(components3, models3, n3));

        String components4 = "def";
        String[] models4 = {"d", "e", "f", "de", "ef", "def", "abc"};
        int n4 = 7;
        int expected4 = 6;
        assertEquals(expected4, DY_07_ConsistentCarModels.consistentCarModels1(components4, models4, n4));

        String components5 = "a";
        String[] models5 = {"a", "b", "aa", "aaa"};
        int n5 = 4;
        int expected5 = 3;
        assertEquals(expected5, DY_07_ConsistentCarModels.consistentCarModels1(components5, models5, n5));
    }
}
