/*
 * Submission: 1741717832
 * Problem: Merge Nodes in Between Zeros (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-20 06:28:08 UTC
 * Runtime: 18 ms
 * Memory: 93.4 MB
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
    public ListNode mergeNodes(ListNode head) {
        return doit(head.next);
    }

    private ListNode doit(ListNode head) {
        if (head == null) return null;
        ListNode TEMP = head;
        int value = 0;
        while(TEMP != null && TEMP.val != 0) {
            value += TEMP.val;
            TEMP = TEMP.next;
        }
        ListNode neW = new ListNode(value);
        neW.next = doit(TEMP.next);

        return neW;
    }
}