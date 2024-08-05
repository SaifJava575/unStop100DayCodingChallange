package com.unstop.day09;

import java.util.Arrays;
import java.util.Scanner;

public class DY_09_ReenaFruits {
	
	public static int getMinimumSumOfTheFruits(int[] arr, int n) {
		Arrays.sort(arr);
		int i=0;
		int sum=0;
		while(i<n) {
			sum+=arr[i];
			i+=2;
		}
		return sum;
	}

	public static void main(String[] args) {
		//int arr[]= {5, 3, 2, 1 ,6, 3};
		//int n=arr.length;
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int res=getMinimumSumOfTheFruits(arr,n);
		System.out.println(res);

	}


}
