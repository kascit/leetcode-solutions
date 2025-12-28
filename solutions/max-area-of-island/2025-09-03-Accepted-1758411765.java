/*
 * Submission: 1758411765
 * Problem: Max Area of Island (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 16:17:36 UTC
 * Runtime: 1 ms
 * Memory: 45 MB
 */

class Solution {
    int[][] grid;
    int rows, cols;
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        rows = grid.length; cols = grid[0].length;
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans,fuckit(i,j));
                }
            }
        } return ans;
    }

    private int fuckit(int i, int j) {
        if (i < 0 || j < 0 || i == rows || j == cols || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return fuckit(i-1,j) +
        fuckit(i,j-1) +
        fuckit(i,j+1) +
        fuckit(i+1,j) + 1;
    }
}