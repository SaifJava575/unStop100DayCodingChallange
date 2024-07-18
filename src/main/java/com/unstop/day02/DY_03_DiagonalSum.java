package com.unstop.day02;

import java.util.Scanner;

public class DY_03_DiagonalSum {

	public static int diagonalSum(int n) {
		if (n>0 && n % 2 == 0)
			return n * 2;
		else if( n>0 && n%2==1)
			return n * 2 - 1;
		else if(n<0 && n%2==0) 
			return n*2;
		else if(n<0 && n!=0)
			return n*2+1;
		else 
			return 0;
	}

	public static void main(String[] args) {
		/*
		 * int matrix=3; int response=diagonalSum(matrix);
		 * System.out.println("The Diagonal Sum is :: "+ response);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number");
		int n = sc.nextInt();
		int response = diagonalSum(n);
		System.out.println(response);

	}

}
