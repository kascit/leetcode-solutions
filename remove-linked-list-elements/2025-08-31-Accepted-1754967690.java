/*
 * Submission: 1754967690
 * Problem: Remove Linked List Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 16:28:22 UTC
 * Runtime: 1 ms
 * Memory: 45.7 MB
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode du = new ListNode(-1), d = du;

        while (head != null) {
            if (head.val != val) {
                d.next = head;
                d = d.next;
            }
            head = head.next;
        } d.next = null;
        return du.next;
    }
}