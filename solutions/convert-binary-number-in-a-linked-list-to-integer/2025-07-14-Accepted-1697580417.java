/*
 * Submission: 1697580417
 * Problem: Convert Binary Number in a Linked List to Integer (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-14 14:04:27 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
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
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null){
            ans = 2*ans + head.val;
            head = head.next;
        }
        return ans;
    }
}