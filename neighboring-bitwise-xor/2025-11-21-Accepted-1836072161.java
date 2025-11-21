/*
 * Submission: 1836072161
 * Problem: Neighboring Bitwise XOR (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 15:01:28 UTC
 * Runtime: 2 ms
 * Memory: 199.1 MB
 */

class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans = 0;
        for (int d : derived) ans ^= d;
        return ans == 0;
    }
}