package com.unstop.day05;

import java.util.Scanner;

class BST {
	int val;
	BST left, right;

	public BST(int val) {
		super();
		this.val = val;
	}
}

public class DY_08_PalyingWithTree {

	public static BST insertNode(BST node, int val) {
		if (node == null)
			return new BST(val);
		if (val < node.val)
			node.left = insertNode(node.left, val);
		else
			node.right = insertNode(node.right, val);
		return node;
	}
	 public static BST lowestCommonAncestor(BST root, int x, int y) {
	        while (root != null) {
	            if (x < root.val && y < root.val) {
	                root = root.left;
	            } else if (x > root.val && y > root.val) {
	                root = root.right;
	            } else {
	                return root;
	            }
	        }
	        return null;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BST root=null;
		
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			root=insertNode(root, val);
		}
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		BST lcs=lowestCommonAncestor(root, x, y);
		if(lcs!=null) {
			System.out.println("Lowest common ancestor value is :"+lcs.val);
		} else {
			System.out.println("Lowest Common Ancestor value is not found ");
		}
		sc.close();

	}

}
