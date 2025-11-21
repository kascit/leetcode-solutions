/*
 * Submission: 1760384266
 * Problem: Minimum Operations to Make the Integer Zero (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 11:17:16 UTC
 * Runtime: 0 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 32; k++) {
            long cur = (long) num1 - (long) k * num2;
            if (cur < k) continue;
            if (Long.bitCount(cur) <= k) return k;
        }
        return -1;
    }
}
