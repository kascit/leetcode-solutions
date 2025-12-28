/*
 * Submission: 1743545895
 * Problem: Remove Nodes From Linked List (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 18:03:38 UTC
 * Runtime: 22 ms
 * Memory: 62.1 MB
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
    public ListNode removeNodes(ListNode head) {
        Deque<ListNode> dq = new ArrayDeque<>();
        while(head != null){
            int cur = head.val;
            while (!dq.isEmpty() && dq.peekLast().val < cur){
                dq.pollLast();
            }
            dq.offerLast(head);
            head = head.next;
        }

        ListNode ans = new ListNode(-1);
        ListNode TEMP = ans;
        while(!dq.isEmpty()){
            ans.next = dq.pollFirst();
            ans = ans.next;
        } return TEMP.next;
    }
}