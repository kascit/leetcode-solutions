/*
 * Submission: 1758476118
 * Problem: Divide Two Integers (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:11:15 UTC
 * Runtime: 0 ms
 * Memory: 41 MB
 */

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1) return 2147483647;
        return dividend/divisor;
    }
}