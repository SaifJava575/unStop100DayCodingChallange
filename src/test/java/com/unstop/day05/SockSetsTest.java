package com.unstop.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class SockSetsTest {

    public static long calculateSockSets(int[] socks) {
        Map<Integer, Long> sockCount = Arrays.stream(socks)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long res=sockCount.values().stream()
            .mapToLong(count -> (count * 2) / 3) // Since each entry represents two socks
            .sum();
        return res;
    }

    @Test
    public void testSockSetsExample1() {
        int[] socks = {1, 3, 3, 1, 1, 3};
        long expected = 4;
        assertEquals(expected, calculateSockSets(socks));
    }

    @Test
    public void testSockSetsExample2() {
        int[] socks = {1, 2, 3, 4, 5, 6};
        long expected = 0;
        assertEquals(expected, calculateSockSets(socks));
    }

    @Test
    public void testSockSetsExample3() {
        int[] socks = {1, 1, 1, 1, 1, 1};
        long expected = 4;
        assertEquals(expected, calculateSockSets(socks));
    }

    @Test
    public void testSockSetsSinglePair() {
        int[] socks = {1};
        long expected = 0;
        assertEquals(expected, calculateSockSets(socks));
    }

    @Test
    public void testSockSetsNoPairs() {
        int[] socks = {};
        long expected = 0;
        assertEquals(expected, calculateSockSets(socks));
    }

    @Test
    public void testSockSetsMixed() {
        int[] socks = {1, 2, 2, 1, 3, 3, 3, 3, 3, 3};
        long expected = 6;
        assertEquals(expected, calculateSockSets(socks));
    }
}
