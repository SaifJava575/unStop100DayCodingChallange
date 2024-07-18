package com.unstop.day02;

import java.util.List;
import java.util.Scanner;

public class GoodPudding {

	public static int[] goodPuddingApproach(List<Integer> arr) {
		int response[] = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) % 10 == 0)
				response[i] = 0;
			else
				response[i] = 1;
		}
		return response;
	}
	
	public static int isGoodPudding(int n) {
		String originalStr = Integer.toString(n);
		String reversedStr = new StringBuilder(originalStr).reverse().toString();
		int reversedInt = Integer.parseInt(reversedStr);
		String doubleReversedStr = new StringBuilder(Integer.toString(reversedInt)).reverse().toString();
		int doubleReversedInt = Integer.parseInt(doubleReversedStr);
		return (doubleReversedInt == n) ? 1 : 0;
	}

	public static void main(String[] args) {
		/*List<Integer> list = Arrays.asList(1010, 2123, 9004);
        int res[]=goodPuddingApproach(list);
        for(Integer ans:res)
        	System.out.print(ans+" "); */
		
		 Scanner scanner = new Scanner(System.in);

	        // Read number of test cases
	        int n = scanner.nextInt();

	        // Process each test case
	        for (int i = 0; i < n; i++) {
	            int num = scanner.nextInt();
	            System.out.println(isGoodPudding(num));
	        }

	        scanner.close();
	}

}
