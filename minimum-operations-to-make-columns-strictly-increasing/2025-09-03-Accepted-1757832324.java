/*
 * Submission: 1757832324
 * Problem: Minimum Operations to Make Columns Strictly Increasing (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 05:25:22 UTC
 * Runtime: 1 ms
 * Memory: 45 MB
 */

class Solution {
    public int minimumOperations(int[][] grid) {
        int ans = 0, cols = grid[0].length, rows = grid.length;
        for (int j = 0; j < cols; j++) {
            for (int i = 1; i < rows; i++) {
                int prev = grid[i-1][j];
                int cur = grid[i][j];
                int diff = prev - cur;
                if (diff >= 0) {
                    ans += diff+1;
                    grid[i][j] += diff+1;
                }
            }
        } return ans;
    }
}