/*
 * Submission: 1746635161
 * Problem: Distribute Candies Among Children I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 13:14:19 UTC
 * Runtime: 15 ms
 * Memory: 40.9 MB
 */

class Solution {
    public int distributeCandies(int n, int limit) {
        int ans = 0;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                for (int k = 0; k <= limit; k++) {
                    if (i+j+k == n) ans++;
                }
            }
        } return ans;
    }
}