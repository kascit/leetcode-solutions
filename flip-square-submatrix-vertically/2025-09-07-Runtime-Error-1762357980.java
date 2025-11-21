/*
 * Submission: 1762357980
 * Problem: Flip Square Submatrix Vertically (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-09-07 06:55:18 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int i = x; i < x + k/2; i++) {
            for (int j = y; j < y + k; j++) {
                int t = grid[i][j];
                grid[i][j] = grid[i+k-1][j];
                grid[i+k-1][j] = t;
            }
        } return grid;
    }
}