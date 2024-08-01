package com.unstop.day05;

import java.util.ArrayList;
import java.util.List;

public class DY_08_AliceCleanHome {

	public static void main(String[] args) {
		int arr[]= {1,0,4,5,0,4,6,0,8};
		int n=arr.length;
		
		int res[]=aliceCleanHome(arr,n);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}

	public static int[] aliceCleanHome(int[] arr, int n) {
		int count=0;
		int res[]=new int[n];
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
			}else {
				list.add(arr[i]);
			}
		}
		for(int i=0;i<list.size();i++) {
			res[i]=list.get(i);
		}
		int i=list.size();
		while(count!=0) {
			res[i]=0;
			i++;
			count--;
		}
		return res;
	}

}
