package com.unstop.day05;
import java.util.Scanner;

public class DY_07_TotalSetBits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input integer N
        int N = scanner.nextInt();

        // Calculate the total number of set bits from 1 to N
        long totalSetBits = calculateTotalSetBits(N);

        // Output the result
        System.out.println(totalSetBits);

        scanner.close();
    }

    public static long calculateTotalSetBits(int N) {
        long totalSetBits = 0;
        for (int i = 1; i <= N; i++) {
            totalSetBits += Integer.bitCount(i);
        }
        return totalSetBits;
    }
}
