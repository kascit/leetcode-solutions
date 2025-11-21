/*
 * Submission: 1750107636
 * Problem: Island Perimeter (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-27 11:55:50 UTC
 * Runtime: 4 ms
 * Memory: 46 MB
 */

class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i-1][j] == 0) ans++;
                    if (j == 0 || grid[i][j-1] == 0) ans++;
                    if (i == grid.length - 1 || grid[i+1][j] == 0) ans++;
                    if (j == grid[i].length - 1 || grid[i][j+1] == 0) ans++;
                }
            }
        } return ans;
    }
}