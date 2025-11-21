/*
 * Submission: 1741643005
 * Problem: Count Square Submatrices with All Ones (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-20 05:11:47 UTC
 * Runtime: 5 ms
 * Memory: 56.5 MB
 */

class Solution {
    public int countSquares(int[][] matrix) {
        final int rows = matrix.length;
        final int cols = matrix[0].length;
        int ans = 0;

        // handle first row and col directly while summing
        for (int j = 0; j < cols; j++) ans += matrix[0][j];
        for (int i = 1; i < rows; i++) ans += matrix[i][0];

        // process the rest
        for (int i = 1; i < rows; i++) {
            int[] cur = matrix[i];
            int[] prev = matrix[i - 1];
            for (int j = 1; j < cols; j++) {
                if (cur[j] == 1) {
                    int left = cur[j - 1];
                    int top = prev[j];
                    int diag = prev[j - 1];

                    // manual min-of-3 (avoids multiple Math.min calls)
                    int min = (left < top) ? left : top;
                    if (diag < min) min = diag;

                    cur[j] = 1 + min;
                }
                ans += cur[j];
            }
        }
        return ans;
    }
}
