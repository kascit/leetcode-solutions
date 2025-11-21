/*
 * Submission: 1721799467
 * Problem: Linked List Cycle II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-03 11:16:29 UTC
 * Runtime: 0 ms
 * Memory: 44.7 MB
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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {cycle = true; break;}
        }
        if (!cycle) return null;
        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        } return fast;

    }
}