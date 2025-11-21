/*
 * Submission: 1743306978
 * Problem: Count Submatrices With All Ones (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 14:41:15 UTC
 * Runtime: 8 ms
 * Memory: 45.7 MB
 */

class Solution {

    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int res = 0;
        int[][] row = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    row[i][j] = mat[i][j];
                } else {
                    row[i][j] = mat[i][j] == 0 ? 0 : row[i][j - 1] + 1;
                }
                int cur = row[i][j];
                for (int k = i; k >= 0; k--) {
                    cur = Math.min(cur, row[k][j]);
                    if (cur == 0) {
                        break;
                    }
                    res += cur;
                }
            }
        }
        return res;
    }
}