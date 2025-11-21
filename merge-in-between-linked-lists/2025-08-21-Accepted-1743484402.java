/*
 * Submission: 1743484402
 * Problem: Merge In Between Linked Lists (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 17:16:07 UTC
 * Runtime: 1 ms
 * Memory: 46.4 MB
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
        while(i != b){
            if (i == a-1) before = last;
            last = last.next;
            i++;
        }
        before.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = last.next;
        return list1;
    }
}