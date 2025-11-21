/*
 * Submission: 1741825310
 * Problem: Delete Node in a Linked List (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-20 08:38:25 UTC
 * Runtime: 0 ms
 * Memory: 43.8 MB
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}