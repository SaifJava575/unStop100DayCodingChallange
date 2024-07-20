package com.unstop.day02;

import java.util.Scanner;

public class DY_04_Box_AB_Pattern {

	public static String boxAbPatter(String str) {
		char arr[] = str.toCharArray();
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i])
				continue;
			else if (arr[i - 1] != arr[i]) {
				count++;
			}
		}
		if (count > 1)
			return "NO";

		return "YES";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		//String str = "aaba";
		String response = boxAbPatter(str);
		System.out.println(response);
	}

}
