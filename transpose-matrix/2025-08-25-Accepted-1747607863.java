/*
 * Submission: 1747607863
 * Problem: Transpose Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 10:28:39 UTC
 * Runtime: 0 ms
 * Memory: 45.4 MB
 */

class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];
        for (int i = 0; i< m; i++){
            for (int j = 0; j < n; j++) {
                ans[j][i] = matrix[i][j];
            }
        } return ans;
    }
}