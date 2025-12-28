/*
 * Submission: 1762771055
 * Problem: Find the Child Who Has the Ball After K Seconds (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 14:51:30 UTC
 * Runtime: 0 ms
 * Memory: 40.9 MB
 */

class Solution {
    public int numberOfChild(int n, int k) {
        int cycle = k/(n-1);
        if ((cycle&1) == 0) {
            return k%(n-1);
        }
        return n - k%(n-1) - 1;
    }
}