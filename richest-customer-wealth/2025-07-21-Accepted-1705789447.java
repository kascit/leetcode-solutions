/*
 * Submission: 1705789447
 * Problem: Richest Customer Wealth (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 10:18:06 UTC
 * Runtime: 0 ms
 * Memory: 42.4 MB
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int i = 0; i < accounts.length; i++){
            int cur = 0;
            for (int j = 0; j < accounts[i].length; j++){
                cur += accounts[i][j];
            }
            ans = Math.max(cur,ans);
        }
        return ans;
    }
}