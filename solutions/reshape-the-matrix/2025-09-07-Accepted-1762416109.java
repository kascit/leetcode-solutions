/*
 * Submission: 1762416109
 * Problem: Reshape the Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 08:00:42 UTC
 * Runtime: 0 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int x = 0, y = 0;
        int rows = mat.length, cols = mat[0].length;
        if (rows*cols != r*c) return mat;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[x][y++] = mat[i][j];
                if (y == c) {
                    x++;
                    y = 0;
                }
            }
        } return ans;
    }
}