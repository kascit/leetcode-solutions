/*
 * Submission: 1834033996
 * Problem: 1-bit and 2-bit Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 08:26:01 UTC
 * Runtime: 0 ms
 * Memory: 44.6 MB
 */

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) return true;
            if (bits[i] == 1) i++;
            // else i++;
        } return false;
    }
}