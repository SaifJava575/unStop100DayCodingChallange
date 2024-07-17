package com.unstop.day01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyDifference {
	
	
	public static int maxAbsoluteDifference(int[][] queries) {
		
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int[] query : queries) {
			int count = query[0];
			int number = query[1];
			frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + count);
		}

		if (frequencyMap.isEmpty()) {
			return 0; 
		}
		int maxFrequency = Integer.MIN_VALUE;
		int minFrequency = Integer.MAX_VALUE;

		for (int frequency : frequencyMap.values()) {
			if (frequency > maxFrequency) {
				maxFrequency = frequency;
			}
			if (frequency < minFrequency) {
				minFrequency = frequency;
			}
		}

		return Math.abs(maxFrequency - minFrequency);
	}
	
	 private Map<Integer, Integer> frequencyMap;
	    public FrequencyDifference() {     
	        frequencyMap = new HashMap<>();
	    }

	    public int[][] readInput() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of queries:");
	        int n = scanner.nextInt();
	        int[][] queries = new int[n][2];
	        
	        System.out.println("Enter the queries (a, b):");
	        for (int i = 0; i < n; i++) {
	            queries[i][0] = scanner.nextInt(); // a
	            queries[i][1] = scanner.nextInt(); // b
	        }
	        
	        scanner.close();
	        return queries;
	    }
	    
	    
	    public void processQueries(int[][] queries) {
	        for (int[] query : queries) {
	            int count = query[0];
	            int number = query[1];
	            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + count);
	        }
	    }

	    // Method to get the maximum absolute difference between the highest and lowest frequencies
	    public int getMaxAbsoluteDifference() {
	        if (frequencyMap.isEmpty()) {
	            return 0; // If there are no numbers, return 0 (though per problem statement, there's at least one)
	        }

	        int maxFrequency = Integer.MIN_VALUE;
	        int minFrequency = Integer.MAX_VALUE;

	        for (int frequency : frequencyMap.values()) {
	            if (frequency > maxFrequency) {
	                maxFrequency = frequency;
	            }
	            if (frequency < minFrequency) {
	                minFrequency = frequency;
	            }
	        }
	        return Math.abs(maxFrequency - minFrequency);
	    }

	public static void main(String[] args) {
		 FrequencyDifference fd = new FrequencyDifference();
	        
	        // Read the input dynamically
	        int[][] queries = fd.readInput();
	        
	        // Process the queries
	        fd.processQueries(queries);
	        
	        // Get the maximum absolute difference
	        int result = fd.getMaxAbsoluteDifference();
	        
	        // Print the result
	        System.out.println(result);
	}

}
