/*
 * Submission: 1760384106
 * Problem: Minimum Operations to Make the Integer Zero (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-05 11:17:05 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 31; k++) {
            long cur = (long) num1 - (long) k * num2;
            if (cur < k) continue;
            if (Long.bitCount(cur) <= k) return k;
        }
        return -1;
    }
}
