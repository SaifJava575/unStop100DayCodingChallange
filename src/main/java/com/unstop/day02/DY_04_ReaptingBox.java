package com.unstop.day02;

import java.util.HashMap;
import java.util.Map;

public class DY_04_ReaptingBox {

	public static void main(String[] args) {
		int arr[]= {6, 5, 1, 5, 5, 7};
        int n=arr.length;
        int response=repetedNumberOfTheBox(arr,n);
        System.out.println(response);
	}

	public static int repetedNumberOfTheBox(int[] arr, int n) {
		Map<Integer,Integer> map=new HashMap<>();
		int repetedNumber=0;
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer,Integer> res:map.entrySet()) {
			if(res.getValue()>1) {			
				repetedNumber=Math.max(repetedNumber, res.getKey());
			}
		}
		return repetedNumber;
	}

}
