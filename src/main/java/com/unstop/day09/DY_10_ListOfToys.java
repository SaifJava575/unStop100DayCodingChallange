package com.unstop.day09;

import java.util.Scanner;

public class DY_10_ListOfToys {
	
	public static int[] listOfToys(int[] arr, int n) {
		int res[]=null;
		if(n==arr.length/2) {
		 res=new int[2*n];
		}else if(n==0){
			 res=new int[2*arr.length];			
		}else if(n<arr.length) {
			res=new int[(arr.length-n)*2];
		}
		int j=0;		
		if(n!=0) {
		for(int i=0;i<n;i++) {
			res[j]=arr[i];
			j+=2;
		}}else {
			int k=1;
			for(int i=0;i<arr.length;i++) {
				res[k]=arr[i];
				k+=2;		
			}
			return res;
		}
		j=1;
		int len=arr.length;
		if(len ==2*n) {
		for(int i=n;i<len;i++) {
			res[j]=arr[i];
			j+=2;
		}
		} else {
			return res;
		}
		
		return res;
	}

	public static void main(String[] args) {
		//int n=4;
		//int lenght=2*n;
		//int arr[]=new int[lenght];
		//arr= new int[]{1,2,3,4,4,3,2,1};
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int length=2*n;
		int arr[]=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		int res[]=listOfToys(arr,n);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
      sc.close();
	}

	

}
