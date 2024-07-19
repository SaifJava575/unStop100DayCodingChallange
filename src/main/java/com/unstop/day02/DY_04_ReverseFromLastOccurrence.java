package com.unstop.day02;
import java.util.*;

public class DY_04_ReverseFromLastOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string s
        String s = scanner.nextLine();

        // Read the character ch
        char ch = scanner.nextLine().charAt(0);

        // Compute the transformed string
        String transformedString = reverseFromLastOccurrence(s, ch);

        // Print the result
        System.out.println(transformedString);

        scanner.close();
    }

    public static String reverseFromLastOccurrence(String s, char ch) {
        // Find the index of the last occurrence of ch
        int idx = s.lastIndexOf(ch);
        
        // If the character is not found, return the original string
        if (idx == -1) {
            return s;
        }
        //abxcced
        // Reverse the substring from idx to the end
        String prefix = s.substring(0, idx);
        String suffix = new StringBuilder(s.substring(idx )).reverse().toString();

        // Combine the prefix and the reversed suffix
        return prefix + suffix;
    }
}
