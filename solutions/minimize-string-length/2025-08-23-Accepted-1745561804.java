/*
 * Submission: 1745561804
 * Problem: Minimize String Length (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:52:40 UTC
 * Runtime: 3 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int minimizedStringLength(String s) {
        int mask = 0;
        for (int i = 0; i < s.length(); i++) {
            mask |= 1 << (s.charAt(i) - 'a');
        }
        return Integer.bitCount(mask);
    }
}
