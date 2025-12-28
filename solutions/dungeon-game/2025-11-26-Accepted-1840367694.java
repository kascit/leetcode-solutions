/*
Submission: 1840367694
Status: Accepted
Timestamp: 2025-11-26 16:02:29 UTC
Runtime: 0 ms
Memory: 45.1 MB
*/

class Solution {
    int[][] d;
    int[][] memo;
    int rows, cols;

    public int calculateMinimumHP(int[][] dungeon) {
        d = dungeon;
        rows = dungeon.length;
        cols = dungeon[0].length;
        memo = new int[rows][cols];

        return dfs(0, 0);
    }

    int dfs(int i, int j) {
        if (i >= rows || j >= cols) return Integer.MAX_VALUE / 2;

        if (memo[i][j] != 0) return memo[i][j];

        if (i == rows - 1 && j == cols - 1) {
            int need = Math.max(1, 1 - d[i][j]);
            memo[i][j] = need;
            return need;
        }

        int right = dfs(i, j + 1);
        int down  = dfs(i + 1, j);

        int bestNext = Math.min(right, down);
        int need = Math.max(1, bestNext - d[i][j]);

        memo[i][j] = need;
        return need;
    }
}
