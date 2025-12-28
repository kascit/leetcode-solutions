/*
 * Submission: 1758407488
 * Problem: Number of Islands (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 16:13:58 UTC
 * Runtime: 3 ms
 * Memory: 50.2 MB
 */

class Solution {
    char[][] grid;
    int rows, cols;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        rows = grid.length; cols = grid[0].length;
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    fuckit(i,j);
                    ans++;
                }
            }
        } return ans;
    }

    private void fuckit(int i, int j) {
        if (i < 0 || j < 0 || i == rows || j == cols || grid[i][j] == '0') return;
        grid[i][j] = '0';
        fuckit(i-1,j);
        fuckit(i,j-1);
        fuckit(i,j+1);
        fuckit(i+1,j);
    }
}