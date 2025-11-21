/*
 * Submission: 1720213387
 * Problem: Linked List Cycle (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-02 05:36:39 UTC
 * Runtime: N/A
 * Memory: N/A
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        } return false;
    }
}