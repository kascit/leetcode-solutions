/*
Submission: 1840338689
Status: Accepted
Timestamp: 2025-11-26 15:22:23 UTC
Runtime: 56 ms
Memory: 90.5 MB
*/

class Solution {

    public int numberOfPaths(int[][] grid, int k) {
        int MOD = 1000000007;
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][k];
        for (int i = 0; i < k; i++) {
            dp[0][0][i] = ((grid[0][0] + i)%k == 0) ? 1 : 0;
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                for (int l = 0; l < k; l++) {
                    int up = 0, left = 0;
                    int cur = grid[i][j];
                    if (i > 0) {
                        up = dp[i-1][j][(cur+l)%k];
                    }
                    if (j > 0) {
                        left = dp[i][j-1][(cur+l)%k];
                    }

                    dp[i][j][l] = (up + left) % MOD;
                }
            }
        } return dp[m-1][n-1][0];
    }
}