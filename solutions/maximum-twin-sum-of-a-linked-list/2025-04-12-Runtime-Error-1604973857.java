/*
 * Submission: 1604973857
 * Problem: Maximum Twin Sum of a Linked List (Medium)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-04-12 20:53:55 UTC
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
    public int pairSum(ListNode head) {
        int max = 0, i = 0;
        int[] arr = new int[10000];
        while(head != null){
            arr[i++] = head.val;
            head = head.next;
        }
        for(int l = 0, r = i - 1; l < r; l++, r--){
            // System.out.println("l: " + arr[l] + "r-: " + arr[r-1]+ "r: " + arr[r]+ "r+: " + arr[r+1]);
            max = (max < arr[l] + arr[r]) ? arr[l] + arr[r] : max;
        }
        return max;
    }
}