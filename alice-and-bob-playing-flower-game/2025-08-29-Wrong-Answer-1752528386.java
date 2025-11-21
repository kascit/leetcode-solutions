/*
 * Submission: 1752528386
 * Problem: Alice and Bob Playing Flower Game (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-29 14:47:01 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public long flowerGame(int n, int m) {
        return (n/2)*((m+1)/2) + (m/2)*((n+1)/2);
    }
}