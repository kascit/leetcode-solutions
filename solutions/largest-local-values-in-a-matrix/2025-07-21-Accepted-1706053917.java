/*
 * Submission: 1706053917
 * Problem: Largest Local Values in a Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 14:37:23 UTC
 * Runtime: 13 ms
 * Memory: 45.8 MB
 */

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < n - 2; j++){
                int max = Math.max(grid[i][j], grid[i][j+1]);
                max = Math.max(max, grid[i][j+2]);
                max = Math.max(max, grid[i+1][j]);
                max = Math.max(max, grid[i+1][j+1]);
                max = Math.max(max, grid[i+1][j+2]);
                max = Math.max(max, grid[i+2][j]);
                max = Math.max(max, grid[i+2][j+1]);
                max = Math.max(max, grid[i+2][j+2]);
                ans[i][j] = max;
            }
        }
        return ans;
    }
}