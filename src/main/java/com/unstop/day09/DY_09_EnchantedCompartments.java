package com.unstop.day09;
import java.util.Scanner;

public class DY_09_EnchantedCompartments {

    // Function to calculate the number of ways to reach the nth compartment
    public static int countWays(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = countWays(n);

        System.out.println(result);

        sc.close();
    }
}
