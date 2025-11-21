/*
 * Submission: 1746636443
 * Problem: Distribute Candies Among Children I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 13:15:41 UTC
 * Runtime: 4 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int distributeCandies(int n, int limit) {
        int ans = 0;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= Math.min(limit,n-i); j++) {
                for (int k = 0; k <= Math.min(limit,n-i-j); k++) {
                    if (i+j+k == n) ans++;
                }
            }
        } return ans;
    }
}