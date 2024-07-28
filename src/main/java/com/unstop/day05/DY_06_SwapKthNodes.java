package com.unstop.day05;

import java.util.Scanner;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class DY_06_SwapKthNodes {

	// Function to swap kth node values from the beginning and end
	public static ListNode swapKthNodes(ListNode head, int k, int n) {
		if (head == null || k > n)
			return head;

		ListNode first = head;
		ListNode second = head;

		// Find the kth node from the beginning
		for (int i = 1; i < k; i++) {
			first = first.next;
		}

		// Find the kth node from the end
		ListNode temp = head;
		for (int i = 1; i < n - k + 1; i++) {
			temp = temp.next;
		}
		second = temp;

		// Swap the values
		int tempVal = first.val;
		first.val = second.val;
		second.val = tempVal;

		return head;
	}

	// Function to print the linked list
	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	// Main method to read input and execute the swap
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read number of nodes
		int n = scanner.nextInt();

		// Read values of nodes
		ListNode head = null;
		ListNode tail = null;
		for (int i = 0; i < n; i++) {
			int val = scanner.nextInt();
			ListNode newNode = new ListNode(val);
			if (head == null) {
				head = newNode;
				tail = head;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		// Read value of k
		int k = scanner.nextInt();

		// Swap kth nodes
		head = swapKthNodes(head, k, n);

		// Print the modified linked list
		printList(head);

		scanner.close();
	}
}
