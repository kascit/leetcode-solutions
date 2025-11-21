/*
 * Submission: 1721794816
 * Problem: Linked List Cycle (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-03 11:11:03 UTC
 * Runtime: 0 ms
 * Memory: 44.4 MB
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
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;

    }
}