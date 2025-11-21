/*
 * Submission: 1722840868
 * Problem: Remove Duplicates from Sorted List (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-04 09:04:28 UTC
 * Runtime: 0 ms
 * Memory: 44.6 MB
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode h = head;
        while (head != null){
            if (head.next != null && head.val == head.next.val) head.next = head.next.next;
            else head = head.next;
        } return h;

    }
}