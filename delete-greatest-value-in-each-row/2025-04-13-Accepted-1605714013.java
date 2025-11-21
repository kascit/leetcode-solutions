/*
 * Submission: 1605714013
 * Problem: Delete Greatest Value in Each Row (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 15:04:07 UTC
 * Runtime: 4 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        
        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }

        int res = 0;
        
        for (int col = 0; col < n; col++) {
            int maxInCol = 0;
            for (int row = 0; row < m; row++) {
                maxInCol = Math.max(maxInCol, grid[row][col]);
            }
            res += maxInCol;
        }
        
        return res;
    }
}
