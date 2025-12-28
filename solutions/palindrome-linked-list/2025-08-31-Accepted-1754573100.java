/*
 * Submission: 1754573100
 * Problem: Palindrome Linked List (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 09:20:07 UTC
 * Runtime: 11 ms
 * Memory: 57.9 MB
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
        boolean isOdd = (fast != null); 
        fast = head;
        Stack<Integer> st = new Stack<>();
        while (fast != slow) {
            st.push(fast.val);
            fast = fast.next;
        }
        if (isOdd) slow = slow.next;
        // System.out.println(st.toString());
        // System.out.println(slow.val);
        while (slow != null) {
            if (slow.val == st.peek()) st.pop();
            else return false;
            slow = slow.next;
        } return true;
    }
}