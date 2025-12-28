/*
 * Submission: 1747609324
 * Problem: Maximum Containers on a Ship (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 10:30:16 UTC
 * Runtime: 0 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min(n*n,maxWeight/w);
    }
}