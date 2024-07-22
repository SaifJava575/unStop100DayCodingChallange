package com.unstop.day05;
import java.util.Scanner;

public class DY_05_ANDTriplets {
	
    public static int countANDTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if ((arr[i] & arr[j] & arr[k]) == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        System.out.println(countANDTriplets(arr));
    }
}
