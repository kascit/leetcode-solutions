/*
 * Submission: 1759289479
 * Problem: Replace Elements with Greatest Element on Right Side (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 11:23:13 UTC
 * Runtime: 3 ms
 * Memory: 46.8 MB
 */

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            int t = arr[i];
            arr[i] = max;
            max = Math.max(max,t);
        } return arr;
    }
}