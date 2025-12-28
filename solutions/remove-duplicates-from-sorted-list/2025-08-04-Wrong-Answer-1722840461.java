/*
 * Submission: 1722840461
 * Problem: Remove Duplicates from Sorted List (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-04 09:04:01 UTC
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode h = head;
        while (head != null){
            if (head.next != null && head.val == head.next.val) head.next = head.next.next;
            head = head.next;
        } return h;

    }
}