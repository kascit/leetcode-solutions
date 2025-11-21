/*
 * Submission: 1757980483
 * Problem: Find The Original Array of Prefix Xor (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 08:16:52 UTC
 * Runtime: 1 ms
 * Memory: 64.8 MB
 */

class Solution {
    public int[] findArray(int[] pref) {
        int len = pref.length;
        for (int i = len - 1; i > 0; i--) {
            pref[i] ^= pref[i-1];
        } return pref;
    }
}