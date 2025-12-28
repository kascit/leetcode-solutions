/*
 * Submission: 1740829313
 * Problem: Merge k Sorted Lists (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-19 12:48:54 UTC
 * Runtime: 4 ms
 * Memory: 44.7 MB
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode head : lists) {
            if (head != null) pq.add(head);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;

            if (node.next != null) pq.add(node.next);
        }

        return dummy.next;
    }
}