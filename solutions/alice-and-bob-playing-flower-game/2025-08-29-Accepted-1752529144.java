/*
 * Submission: 1752529144
 * Problem: Alice and Bob Playing Flower Game (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 14:47:45 UTC
 * Runtime: 0 ms
 * Memory: 40.7 MB
 */

class Solution {
    public long flowerGame(int n, int m) {
        return (long)(n/2)*((m+1)/2) + (long)(m/2)*((n+1)/2);
    }
}