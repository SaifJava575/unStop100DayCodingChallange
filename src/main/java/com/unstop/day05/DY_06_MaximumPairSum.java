package com.unstop.day05;

import java.util.Arrays;

public class DY_06_MaximumPairSum {
	
	public static int maximumPairSum(int[] arr, int n) {
      Arrays.sort(arr);
      int x=arr[arr.length-1];
      int y=arr[arr.length-2];
      int res=((x-y)+(x*y));
      
		return res;
	}

	public static void main(String[] args) {
		int arr[]= {2 ,4, 5, 1};
		int n =arr.length;
		int res=maximumPairSum(arr,n);
		System.out.println(res);

	}


}
