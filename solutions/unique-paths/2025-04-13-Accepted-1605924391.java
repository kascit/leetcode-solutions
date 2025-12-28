/*
 * Submission: 1605924391
 * Problem: Unique Paths (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 19:12:07 UTC
 * Runtime: 0 ms
 * Memory: 40.1 MB
 */

class Solution {
    public int uniquePaths(int m, int n) {
        if (m <= 1 || n <= 1) return 1;
        int[][] maze = new int[m][n];

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                maze[i][j] = Math.max(maze[i-1][j],1) + Math.max(maze[i][j-1],1);

        return maze[m-1][n-1]; 
    }
}