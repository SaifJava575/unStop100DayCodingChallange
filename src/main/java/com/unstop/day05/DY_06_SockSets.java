package com.unstop.day05;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DY_06_SockSets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of pairs of socks
        int n = scanner.nextInt();
        
        // Create a map to store the count of each color of socks
        Map<Integer, Integer> sockCount = new HashMap<>();

        // Read each pair and update the count in the map
        for (int i = 0; i < n; i++) {
            int color = scanner.nextInt();
            sockCount.put(color, sockCount.getOrDefault(color, 0) + 1); // Each entry represents two socks
        }

        int setsCount = 0;

        // Calculate the number of sets of 3 socks for each color
        for (int count : sockCount.values()) {
            setsCount += count / 3;
        }

        // Output the total number of sets of 3 socks
        System.out.println(setsCount);

        scanner.close();
    }
}
