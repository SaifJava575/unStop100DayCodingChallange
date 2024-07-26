package com.unstop.day05;
import java.util.*;

public class DY_05_BasketBallGame {
	
	 public static int calculateScore(List<String> ops) {
	        Stack<Integer> stack = new Stack<>();
	        
	        for (String op : ops) {
	            switch (op) {
	                case "C":
	                    if (!stack.isEmpty()) {
	                        stack.pop();
	                    }
	                    break;
	                case "D":
	                    if (!stack.isEmpty()) {
	                        stack.push(stack.peek() * 2);
	                    }
	                    break;
	                case "+":
	                    if (stack.size() >= 2) {
	                        int last = stack.pop();
	                        int newTop = stack.peek() + last;
	                        stack.push(last);
	                        stack.push(newTop);
	                    }
	                    break;
	                default:
	                    stack.push(Integer.parseInt(op));
	                    break;
	            }
	        }
	        
	        // Calculate the sum of scores
	        int sum = 0;
	        for (int score : stack) {
	            sum += score;
	        }
	        
	        return sum;
	    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();
        sc.nextLine(); 
        
        List<String> operations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            operations.add(sc.next());
        }
        
        int result = calculateScore(operations);
        
        System.out.println(result);
        
        sc.close();
    }
    
   
}
