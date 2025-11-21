/*
 * Submission: 1605908105
 * Problem: Domino and Tromino Tiling (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 18:51:34 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int numTilings(int n) {
        long[] ans = new long[n+4];
        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 5;
        if (n <= 3) return (int)ans[n];
        for (int i = 4; i <= n; i++){
            ans[i] = 2*ans[i-1] + ans[i-3];
            ans[i] %=1e9+7;
        }
        return (int)ans[n];
    }
}