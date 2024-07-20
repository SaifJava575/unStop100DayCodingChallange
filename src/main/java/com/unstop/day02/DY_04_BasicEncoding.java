package com.unstop.day02;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DY_04_BasicEncoding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of queries
        int q = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Reading the queries
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }

        int result = computeMaxAbsDifference(queries);
        System.out.println(result);
    }

    public static int computeMaxAbsDifference(int[][] queries) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int[] query : queries) {
            int count = query[0];
            int number = query[1];
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + count);
        }

        return calculateMaxAbsDifference(frequencyMap);
    }

    public static int calculateMaxAbsDifference(Map<Integer, Integer> frequencyMap) {
        TreeMap<Integer, Integer> freqCountMap = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int freq = entry.getValue();
            freqCountMap.put(freq, number);
        }

        // If there are less than 2 distinct frequencies, the output should be 0
        if (freqCountMap.size() < 2) {
            return 0;
        } else {
            // Getting the highest and lowest frequencies
            int minFreq = freqCountMap.firstKey();
            int maxFreq = freqCountMap.lastKey();

            // Calculating the absolute difference between numbers with max and min frequencies
            int minNumber = freqCountMap.get(minFreq);
            int maxNumber = freqCountMap.get(maxFreq);

            return Math.abs(maxNumber - minNumber);
        }
    }
}
