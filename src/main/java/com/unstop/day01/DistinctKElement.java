package com.unstop.day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DistinctKElement {

	// T(C)=O(n) and S(C)=O(N)
	public static String getDistinceEelemt(String str[], int k) {
		Map<String, Integer> countMap = new LinkedHashMap<>();
		for (int i = 0; i < str.length; i++) {
			countMap.put(str[i], countMap.getOrDefault(str[i], 0) + 1);
		}
		List<String> uniqueString = new ArrayList<>();
		for (Map.Entry<String, Integer> map : countMap.entrySet()) {
			if (map.getValue() == 1)
				uniqueString.add(map.getKey());
		}
		if (k > 0 && k < uniqueString.size())
			return uniqueString.get(k - 1);
		else
			return "";
	}
	
	 public static void kDistnct(List<String> array, int n) {
	      Map<String, Integer> stringAndRepMap = new LinkedHashMap<>();

	      for (String s : array) {
	       if (!stringAndRepMap.isEmpty() && stringAndRepMap.containsKey(s)) {
	          stringAndRepMap.put(s, stringAndRepMap.get(s) + 1);
	        } else {
	          stringAndRepMap.put(s, 1);
	        }
	      }

	      int counter = 1;
	      Integer minValue =  Collections.min(stringAndRepMap.values());

	        for (String s : stringAndRepMap.keySet()) {
	            if (stringAndRepMap.get(s) == minValue) {
	                if (counter == n) {
	                    System.out.println(s);
	                    break;
	                }
	                counter += 1;
	            }
	        }
	    }

	public static void main(String[] args) {
		String[] strings = { "apple", "banana", "apple", "orange", "banana", "grape", "pear" };
		int k = 2;

		String response = getDistinceEelemt(strings, k);
		System.out.println("The Distinct Elment is ::" + response);
		
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      List<String> array = new ArrayList<>();
	      for (int i = 0; i < n; i++) {
	        sc.nextLine();
	        array.add(sc.next());
	      }
	      sc.nextLine();
	      int p = sc.nextInt();
	      kDistnct(array, p);
	    }

	   
	}


