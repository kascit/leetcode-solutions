/*
 * Submission: 1605927163
 * Problem: Unique Paths (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 19:15:39 UTC
 * Runtime: 0 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int uniquePaths(int m, int n) {

        int N = m + n - 2;
        int r = Math.min(m - 1, n - 1); 
        long res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (N - r + i) / i;
        }
        return (int) res;
    }
}
