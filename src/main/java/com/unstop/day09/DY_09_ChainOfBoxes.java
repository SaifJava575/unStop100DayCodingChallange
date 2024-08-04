package com.unstop.day09;

import java.util.Scanner;

public class DY_09_ChainOfBoxes {
	
	public static int[] reverseOrderOfArrays(int[] arr,int n) {
		int res[]=new int[arr.length];
		int j=0;
		for(int i=n-1;i>=0;i--) {
			res[j]=arr[i];
			j++;
		}
		return res;
	}

	public static void main(String[] args) {
		//int arr[]= {9 ,10, 4 ,2 ,7, 3 ,6};
		//int n=arr.length;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int res[]=reverseOrderOfArrays(arr,n);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}


}
