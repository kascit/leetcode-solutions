/*
 * Submission: 1758390431
 * Problem: Number of Islands (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-03 15:58:07 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length, cols = grid[0].length, ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    if ( (i == 0 || grid[i-1][j] != '1') && (j == 0 || grid[i][j-1] != '1') ) {
                        ans++;
                    }
                }
            }
        } return ans;
    }
}