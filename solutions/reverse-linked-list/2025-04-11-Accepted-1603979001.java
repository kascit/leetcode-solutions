/*
 * Submission: 1603979001
 * Problem: Reverse Linked List (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 19:49:57 UTC
 * Runtime: 0 ms
 * Memory: 42.5 MB
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
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur.next != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        cur.next = prev;
        return cur;
    }
}