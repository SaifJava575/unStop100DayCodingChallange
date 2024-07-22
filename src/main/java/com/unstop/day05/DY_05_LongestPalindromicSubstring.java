package com.unstop.day05;
import java.util.Scanner;

public class DY_05_LongestPalindromicSubstring {
    
    public static int longestPalindromicSubstringLength(String s) {
        int n = s.length();
        if (n == 0) return 0;
        
        boolean[][] dp = new boolean[n][n];
        int maxLength = 1; // Every single character is a palindrome, so min length is 1
        
        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        int start = 0;
        
        // Check for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        
        // Check for lengths greater than 2
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        String s = scanner.nextLine();
        System.out.println(longestPalindromicSubstringLength(s));
        scanner.close();
    }
}
