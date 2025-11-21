/*
 * Submission: 1754569845
 * Problem: Palindrome Linked List (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-31 09:16:31 UTC
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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        int i = 0;
        while (fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            i++;
        }
        fast = head;
        Stack<Integer> st = new Stack<>();
        while (fast != slow) {
            st.push(fast.val);
            fast = fast.next;
        }
        if ((i&1) == 0) slow = slow.next;
        // System.out.println(st.toString());
        // System.out.println(slow.val);
        while (slow != null) {
            if (slow.val == st.peek()) st.pop();
            else return false;
            slow = slow.next;
        } return true;
    }
}