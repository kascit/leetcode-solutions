/*
 * Submission: 1746638996
 * Problem: Distribute Candies Among Children II (Medium)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-08-24 13:18:19 UTC
 * Runtime: N/A
 * Memory: N/A
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