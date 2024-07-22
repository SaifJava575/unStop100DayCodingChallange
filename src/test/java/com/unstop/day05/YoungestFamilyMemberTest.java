package com.unstop.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class YoungestFamilyMemberTest {

    @Test
    public void testFindYoungestMember() {
        int n, m;
        int[][] gifts;

        // Test case 1
        n = 2;
        m = 1;
        gifts = new int[][]{{1, 2}};
        assertEquals(2, DY_05_YoungestFamilyMember.findYoungestMember(n, m, gifts));

        // Test case 2
        n = 3;
        m = 2;
        gifts = new int[][]{{1, 3}, {2, 3}};
        assertEquals(3, DY_05_YoungestFamilyMember.findYoungestMember(n, m, gifts));

        // Test case 3
        n = 3;
        m = 3;
        gifts = new int[][]{{1, 2}, {2, 3}, {3, 1}};
        assertEquals(-1, DY_05_YoungestFamilyMember.findYoungestMember(n, m, gifts));

        // Test case 4
        n = 4;
        m = 3;
        gifts = new int[][]{{1, 4}, {2, 4}, {3, 4}};
        assertEquals(4, DY_05_YoungestFamilyMember.findYoungestMember(n, m, gifts));

        // Test case 5
        n = 4;
        m = 0;
        gifts = new int[][]{};
        assertEquals(-1, DY_05_YoungestFamilyMember.findYoungestMember(n, m, gifts));

        // Test case 6: large input case
        n = 10000;
        m = 9999;
        gifts = new int[m][2];
        for (int i = 1; i < n; i++) {
            gifts[i - 1] = new int[]{i, n};
        }
        assertEquals(10000, DY_05_YoungestFamilyMember.findYoungestMember(n, m, gifts));
    }
}
