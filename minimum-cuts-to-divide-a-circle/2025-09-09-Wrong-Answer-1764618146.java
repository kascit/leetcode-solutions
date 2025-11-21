/*
 * Submission: 1764618146
 * Problem: Minimum Cuts to Divide a Circle (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-09 06:28:16 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int numberOfCuts(int n) {
        // int r = 1, c =;
        // while (r != n)
        return ((n&1) == 0) ? n/2 : n;
    }
}