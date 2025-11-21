/*
 * Submission: 1741700553
 * Problem: Insert Greatest Common Divisors in Linked List (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-20 06:11:05 UTC
 * Runtime: 2 ms
 * Memory: 45.1 MB
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        doit(head);
        return head;
    }

    private void doit(ListNode cur) {
        if (cur == null || cur.next == null) return;
        ListNode n = new ListNode(findGcd(cur.val,cur.next.val));
        n.next = cur.next;
        cur.next = n;
        doit(n.next);
    }

    private int findGcd(int a, int b){
        if (b == 0) return a;
        return findGcd(b,a%b);
    }
}