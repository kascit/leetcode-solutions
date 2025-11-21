/*
 * Submission: 1831285474
 * Problem: Kth Missing Positive Number (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-16 11:51:56 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j = 0, n = arr.length;
        for (int i = 1; i < 1001; i++) {
            if (j >= n || arr[j] != i) k--;
            else j++;
            if (k == 0) return i;
        } return -1;
    }
}