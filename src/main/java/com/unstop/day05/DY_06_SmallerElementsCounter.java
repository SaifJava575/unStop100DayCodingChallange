package com.unstop.day05;
import java.util.Scanner;
import java.util.Arrays;

public class DY_06_SmallerElementsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        
        // Read the elements into an array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Get the count of smaller elements for each number
        int[] result = countSmallerElements(nums);
        
        // Print the result
        for (int count : result) {
            System.out.print(count + " ");
        }

    }
    
    public static int[] countSmallerElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Create a frequency array
        int[] frequency = new int[101]; // Given the constraint 1<=nums[i]<=100
        
        // Count the frequency of each number in the nums array
        for (int num : nums) {
            frequency[num]++;
        }
        
        // Create a cumulative count array
        int[] cumulativeCount = new int[101];
        for (int i = 1; i <= 100; i++) {
            cumulativeCount[i] = cumulativeCount[i - 1] + frequency[i - 1];
        }
        
        // Fill the result array using the cumulative count array
        for (int i = 0; i < n; i++) {
            result[i] = cumulativeCount[nums[i]];
        }
        
        return result;
    }
}
