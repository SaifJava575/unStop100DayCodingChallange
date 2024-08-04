package com.unstop.day09;

import java.util.Scanner;

public class DY_09_FirstWrongDecssion {
	
	public static int firstWrongDecession(String str) {
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='W')
				return i;
			else
				continue;
		}
		return -1;
	}

	public static void main(String[] args) {
		//String str="WCCC";
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int res=firstWrongDecession(str);
		System.out.println(res);
		sc.close();

	}


}
