/*
 * Submission: 1600825617
 * Problem: Merge Two Sorted Lists (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-08 16:45:32 UTC
 * Runtime: 0 ms
 * Memory: 42.9 MB
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to act as the head of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge nodes in order
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Append any remaining nodes
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}
