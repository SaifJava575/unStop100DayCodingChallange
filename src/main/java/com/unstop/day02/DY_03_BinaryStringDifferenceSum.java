package com.unstop.day02;
import java.util.*;

public class DY_03_BinaryStringDifferenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int totalSum = findTotalSum(a, b);

        System.out.println(totalSum);

        scanner.close();
    }

    public static int findTotalSum(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int totalSum = 0;

        // Iterate through all contiguous substrings of b of length aLength
        for (int i = 0; i <= bLength - aLength; i++) {
            String substring = b.substring(i, i + aLength);
            totalSum += countDifferences(a, substring);
        }

        return totalSum;
    }

    public static int countDifferences(String a, String bSubstring) {
        int differences = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != bSubstring.charAt(i)) {
                differences++;
            }
        }
        return differences;
    }
}
