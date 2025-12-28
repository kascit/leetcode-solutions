/*
 * Submission: 1690284785
 * Problem: Guess Number Higher or Lower II (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-08 04:16:36 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int getMoneyAmount(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return (n-2)*2;
    }
}