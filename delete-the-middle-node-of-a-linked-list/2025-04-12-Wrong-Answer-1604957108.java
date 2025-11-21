/*
 * Submission: 1604957108
 * Problem: Delete the Middle Node of a Linked List (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 20:24:10 UTC
 * Runtime: N/A
 * Memory: N/A
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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) return null;
        ListNode slow = new ListNode(), fast = head;
        slow.next = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}