/*
 * Submission: 1757223512
 * Problem: Intersection of Two Linked Lists (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-02 15:55:01 UTC
 * Runtime: 1 ms
 * Memory: 48.5 MB
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        boolean b = true, a = true;
        int i = 0;
        while(headA != null){
            headA = headA.next;
            i++;
        }
        while(headB != null){
            headB = headB.next;
            i++;
        }
        headA = A;
        headB = B;
        // if (i<0) i *= -1;

        while (i>0 && headA != headB) {
            headA = headA.next;
            headB = headB.next;
            if (headA == null){
                if (a) {
                    headA = B;
                } else headA = A;
                a = !a;
            }
            if (headB == null){
                if (b) {
                    headB = A;
                } else headB = B;
                b = !b;
            }
            i--;
        }

        return (headA == headB) ? headA : null;
    }
}