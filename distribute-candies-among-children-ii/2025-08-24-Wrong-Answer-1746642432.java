/*
 * Submission: 1746642432
 * Problem: Distribute Candies Among Children II (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-24 13:21:46 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int distributeCandies(int n, int limit) {
        int ways = 0;
        for (int i = 0; i <= limit; i++) {
            ways += Math.max(Math.min(limit, n - i) - Math.max(0, n - i - limit) + 1, 0);
        }
        return ways;
    }
}