/*
 * Submission: 1746637141
 * Problem: Distribute Candies Among Children I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 13:16:23 UTC
 * Runtime: 1 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int distributeCandies(int n, int limit) {
        int ways = 0;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                int k = n - i - j;
                if (k >= 0 && k <= limit) {
                    ways++;
                }
            }
        }
        return ways;
    }
}