/*
 * Submission: 1832971700
 * Problem: 1-bit and 2-bit Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-18 05:04:53 UTC
 * Runtime: 0 ms
 * Memory: 44.5 MB
 */

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) return true;
            if (bits[i] == 0) continue;
            else i++;
        } return false;
    }
}