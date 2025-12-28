/*
Submission: 1840350784
Status: Accepted
Timestamp: 2025-11-26 15:39:23 UTC
Runtime: 46 ms
Memory: 81.1 MB
*/

class Solution {

    public int numberOfPaths(int[][] grid, int k) {
        int MOD = 1000000007;
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[2][n][k];

        dp[0][0][grid[0][0] % k] = 1;

        for (int i = 0; i < m; i++) {
            int a = (i & 1);
            int b = a ^ 1;
            for (int j = 0; j < n; j++) {
                for (int r = 0; r < k; r++)
                    dp[b][j][r] = 0;
                if (i == 0 && j == 0) {
                    dp[b][0][grid[0][0] % k] = 1;
                    continue;
                }
                int cur = grid[i][j];
                for (int l = 0; l < k; l++) {
                    int want = (l - cur) % k;
                    if (want < 0)
                        want += k;
                    int up = 0, left = 0;
                    if (i > 0) {
                        up = dp[a][j][want];
                    }
                    if (j > 0) {
                        left = dp[b][j - 1][want];
                    }

                    dp[b][j][l] = (up + left) % MOD;
                }
            }
        }
        return dp[m%2][n - 1][0];
    }
}