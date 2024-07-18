package com.unstop.day02;

import java.util.Stack;

public class DY_04_RobotLoops {

	public static String robotLoop(String str) {
		Stack<Character> st=new Stack<>();
		char[] arr=str.toCharArray();

		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='U' || arr[i]=='L' )
				st.push(arr[i]);
			else if(arr[i]=='D' && st.peek()=='U')
				st.pop();
			else if(arr[i]=='R' && st.peek()=='L')
				st.pop();
		}
		if(st.isEmpty())
			return "YES";
		return "NO";	
	}
	
	public static String movement(String moves) {
		 int x = 0, y = 0;	        
	        for (char move : moves.toCharArray()) {
	            switch (move) {
	                case 'R':
	                    x++;
	                    break;
	                case 'L':
	                    x--;
	                    break;
	                case 'U':
	                    y++;
	                    break;
	                case 'D':
	                    y--;
	                    break;
	            }
	        }
	        
	        if (x == 0 && y == 0) {
	            return "YES";
	        } else {
	        	return "NO";
	        }
	}

	public static void main(String[] args) {
		//String str = "UUDDLR";
		//Scanner sc=new Scanner(System.in);
		//String str=sc.next();
		String res=movement("UUDDLR");
		System.out.println(res);
		

	}

}
