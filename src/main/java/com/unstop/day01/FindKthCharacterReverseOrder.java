package com.unstop.day01;

import java.util.Scanner;

public class FindKthCharacterReverseOrder {

	 public static String reverseString(String inputString) {
	        return new StringBuilder(inputString).reverse().toString();
	    }

	    public static char getKthCharacter(String reversedString, int k) {
	        return reversedString.charAt(k - 1); // Convert 1-based index to 0-based
	    }
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        // Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read the string
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = new StringBuilder(inputString).reverse().toString();

        // Output the kth character (1-based index)
        System.out.println(reversedString.charAt(k - 1));
		

	}

}
