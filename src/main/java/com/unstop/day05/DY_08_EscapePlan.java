package com.unstop.day05;

import java.util.Scanner;

public class DY_08_EscapePlan {

	public static void main(String[] args) {
		// int arr[] = { 1, 5, 4, 2, 8 };
		// int n = arr.length;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		escapePlan(arr, n);
		sc.close();
	}

	public static int escapePlan(int[] arr, int n) {
		int res=0;
		if(n==1) {
		 return arr[0];
		}
		 if (n % 2 == 1) {
			res=arr[n/2];
		} else {
			res=arr[n / 2 - 1] + arr[n / 2];
		}
		return res;		
	}

}
