/*
 * Submission: 1733948922
 * Problem: Middle of the Linked List (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 16:12:50 UTC
 * Runtime: 0 ms
 * Memory: 41.3 MB
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        } return slow;
    }
}