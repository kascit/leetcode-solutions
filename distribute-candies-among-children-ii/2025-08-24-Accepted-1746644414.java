/*
 * Submission: 1746644414
 * Problem: Distribute Candies Among Children II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 13:23:48 UTC
 * Runtime: 27 ms
 * Memory: 40.9 MB
 */

class Solution {
    public long distributeCandies(int n, int limit) {
        long ways = 0;
        for (int i = 0; i <= Math.min(limit, n); i++) {
            ways += Math.max(Math.min(limit, n - i) - Math.max(0, n - i - limit) + 1, 0);
        }
        return ways;
    }
}