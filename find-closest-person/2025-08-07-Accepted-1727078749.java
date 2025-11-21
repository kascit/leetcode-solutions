/*
 * Submission: 1727078749
 * Problem: Find Closest Person (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-07 16:34:37 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int findClosest(int x, int y, int z) {
        int a = (x-z > 0) ? x - z : z - x;
        int b = (z-y > 0) ? z - y : y - z;
        return (a==b) ? 0 : (a<b) ? 1 : 2; 
    }
}