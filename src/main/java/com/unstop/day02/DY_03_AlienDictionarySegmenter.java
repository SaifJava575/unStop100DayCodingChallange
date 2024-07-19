package com.unstop.day02;
import java.util.*;

public class DY_03_AlienDictionarySegmenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Set<String> dictionary = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dictionary.add(scanner.nextLine());
        }

        boolean result = canBeSegmented(s, dictionary);

        System.out.println(result ? "true" : "false");

        scanner.close();
    }

    public static boolean canBeSegmented(String s, Set<String> dictionary) {
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true; 

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dictionary.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[length];
    }
}
