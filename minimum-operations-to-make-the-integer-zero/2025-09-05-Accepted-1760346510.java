/*
 * Submission: 1760346510
 * Problem: Minimum Operations to Make the Integer Zero (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 10:32:09 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long cur = (long) num1 - (long) k * num2;
            if (cur < k) continue;
            if (Long.bitCount(cur) <= k) return k;
        }
        return -1;
    }
}
