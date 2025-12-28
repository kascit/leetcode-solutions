/*
 * Submission: 1831286413
 * Problem: Kth Missing Positive Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 11:53:25 UTC
 * Runtime: 1 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j = 0, n = arr.length, i = 1;
        while(true) {
            if (j >= n || arr[j] != i) k--;
            else j++;
            if (k == 0) return i;
            i++;
        }
    }
}