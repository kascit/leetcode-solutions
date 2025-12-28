/*
 * Submission: 1743481448
 * Problem: Merge In Between Linked Lists (Medium)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-21 17:13:58 UTC
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i = 0;
        ListNode last = list1, before = null;
        while(last != null && i != b){
            last = last.next;
            i++;
            if (i == a-1) before = last;
        }
        before.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = last.next;
        return list1;
    }
}