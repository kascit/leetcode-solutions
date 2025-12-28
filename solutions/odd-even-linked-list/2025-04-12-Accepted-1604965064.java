/*
 * Submission: 1604965064
 * Problem: Odd Even Linked List (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 20:37:57 UTC
 * Runtime: 0 ms
 * Memory: 45 MB
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        if (head.next.next == null) return head;
        ListNode odd = head, even = head.next, e = head.next;
        while(odd.next != null && even.next != null){
            odd.next = even.next;
            even.next = odd.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = e;
        return head;
    }
}