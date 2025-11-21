/*
 * Submission: 1742820553
 * Problem: Maximal Square (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 05:27:29 UTC
 * Runtime: 4 ms
 * Memory: 60.3 MB
 */

class Solution {
    public int maximalSquare(char[][] mat) {
        final int rows = mat.length;
        final int cols = mat[0].length;
        int ans = 0;
        boolean done = false;
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = mat[i][j]-'0';
                if (!done && matrix[i][j] == 1) ans = 1;
            }
        }


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
                ans = Math.max(ans,cur[j]);
            }
        }
        return ans*ans;
    }
}