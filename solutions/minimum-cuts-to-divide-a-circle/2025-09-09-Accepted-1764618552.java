/*
 * Submission: 1764618552
 * Problem: Minimum Cuts to Divide a Circle (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-09 06:28:45 UTC
 * Runtime: 0 ms
 * Memory: 40.1 MB
 */

class Solution {
    public int numberOfCuts(int n) {
        // int r = 1, c =;
        // while (r != n)
        if (n == 1) return 0;
        return ((n&1) == 0) ? n/2 : n;
    }
}