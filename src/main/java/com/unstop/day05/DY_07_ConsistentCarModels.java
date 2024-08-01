package com.unstop.day05;

import java.util.HashSet;
import java.util.Set;

public class DY_07_ConsistentCarModels {
	 
	
	
	public static int consistentCarModels1(String components, String[] models, int n) {
		
		 // Convert allowed components to a set for fast lookups
        Set<Character> allowedComponents = new HashSet<>();
        for (char c : components.toCharArray()) {
            allowedComponents.add(c);
        }
        
        // Count the consistent car models
        int consistentCount = 0;
        for (String model : models) {
            if (isConsistent(model, allowedComponents)) {
                consistentCount++;
            }
        }
        return consistentCount;
	}
	 private static boolean isConsistent(String model, Set<Character> allowedComponents) {
	        for (char c : model.toCharArray()) {
	            if (!allowedComponents.contains(c)) {
	                return false;
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		String tar="emta";
		String arr[]= {"etmb", "e","et", "eam"," mtb"," akm"};
		int n=arr.length;
		
		int res=consistentCarModels1(tar,arr,n);
		System.out.println(res);

	}

	

}
