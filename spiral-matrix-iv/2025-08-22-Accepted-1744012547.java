/*
 * Submission: 1744012547
 * Problem: Spiral Matrix IV (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-22 06:24:19 UTC
 * Runtime: 6 ms
 * Memory: 57 MB
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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(ans[i], -1);
        }
        int top = 0, left = 0, right = n - 1, bottom = m - 1;
        int i = 0, j = 0;
        while (head != null) {
            while (head != null && j <= right) {
                // System.out.println(i+"   "+j);
                ans[i][j++] = head.val;
                head = head.next;
            }
            top++;
            j--;i++;
                // System.out.println(i+"   "+j);
                // System.out.println("rightEND");
            while (head != null && i <= bottom) {
                // System.out.println(i+"   "+j);
                ans[i++][j] = head.val;
                head = head.next;
            }
            right--;
            i--;j--;
                // System.out.println(i+"   "+j);
                // System.out.println("bottomEND");
            // System.out.println(left+"   "+right+"   "+top+"   "+bottom);
            if (top<=bottom) {
                while (head != null && left <= j) {
                    // System.out.println(i+"   "+j);
                    ans[i][j--] = head.val;
                    head = head.next;
                }
                bottom--;j++;i--;
                // System.out.println(i+"   "+j);
                // System.out.println("leftEND");
            // System.out.println(left+"   "+right+"   "+top+"   "+bottom);
            }
            if (left <= right) {
                while (head != null && top <= i) {
                    // System.out.println(i+"   "+j);
                    ans[i--][j] = head.val;
                    head = head.next;
                }
                left++;i++;j++;
                // System.out.println(i+"   "+j);
                // System.out.println("upEND");
            // System.out.println(left+"   "+right+"   "+top+"   "+bottom);
            }
        } return ans;
    }
}