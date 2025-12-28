/*
 * Submission: 1736937251
 * Problem: Hamming Distance (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 06:54:49 UTC
 * Runtime: 0 ms
 * Memory: 40.2 MB
 */

class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}