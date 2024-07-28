package com.unstop.day05;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SwapKthNodesTest {

    // Helper function to create a linked list from an array
    private ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper function to convert a linked list to an array
    private int[] linkedListToArray(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        int[] array = new int[length];
        current = head;
        for (int i = 0; i < length; i++) {
            array[i] = current.val;
            current = current.next;
        }
        return array;
    }

    @Test
    public void testSwapKthNodes() {
        // Test case 1
        int[] input1 = {1, 2, 3, 4, 5};
        ListNode head1 = createLinkedList(input1);
        ListNode result1 = DY_06_SwapKthNodes.swapKthNodes(head1, 2, input1.length);
        int[] expected1 = {1, 4, 3, 2, 5};
        assertArrayEquals(expected1, linkedListToArray(result1));

        // Test case 2
        int[] input2 = {1, 2, 3, 4, 5, 6, 7, 8};
        ListNode head2 = createLinkedList(input2);
        ListNode result2 = DY_06_SwapKthNodes.swapKthNodes(head2, 3, input2.length);
        int[] expected2 = {1, 2, 6, 4, 5, 3, 7, 8};
        assertArrayEquals(expected2, linkedListToArray(result2));

        // Test case 3
        int[] input3 = {1, 2};
        ListNode head3 = createLinkedList(input3);
        ListNode result3 = DY_06_SwapKthNodes.swapKthNodes(head3, 1, input3.length);
        int[] expected3 = {2, 1};
        assertArrayEquals(expected3, linkedListToArray(result3));

        // Test case 4: k = n
        int[] input4 = {1, 2, 3, 4, 5};
        ListNode head4 = createLinkedList(input4);
        ListNode result4 = DY_06_SwapKthNodes.swapKthNodes(head4, 5, input4.length);
        int[] expected4 = {5, 2, 3, 4, 1};
        assertArrayEquals(expected4, linkedListToArray(result4));

        // Test case 5: Single node list
        int[] input5 = {1};
        ListNode head5 = createLinkedList(input5);
        ListNode result5 = DY_06_SwapKthNodes.swapKthNodes(head5, 1, input5.length);
        int[] expected5 = {1};
        assertArrayEquals(expected5, linkedListToArray(result5));
    }
}
