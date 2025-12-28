/*
 * Submission: 1762365779
 * Problem: Flip Square Submatrix Vertically (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:03:20 UTC
 * Runtime: 1 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int e = x + k - 1;
        for (int i = x; i < e; i++) {
            for (int j = y; j < y + k; j++) {
                int t = grid[i][j];
                grid[i][j] = grid[e][j];
                grid[e][j] = t;
            }
            e--;
        } return grid;
    }
}