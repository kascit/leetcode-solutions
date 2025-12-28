/*
 * Submission: 1834024212
 * Problem: Number of Enclaves (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 08:11:39 UTC
 * Runtime: 8 ms
 * Memory: 63.7 MB
 */

class Solution {
    boolean flag = false;
    
    int help(int[][] grid ,int m ,int n , int i ,int j) {
        // if (vis[i][j]) return 0;
        // vis[i][j] = true;
        if ( i == 0 || j == 0 || i == m || j == n ) {
            if (grid[i][j] == 1) flag = true;
            return 0;
        }
        int tot = grid[i][j];
        grid[i][j] = 0;
        if ( i < m && grid[i+1][j] == 1) {
            tot +=help(grid,m,n,i+1,j);
        }
        if ( j < n && grid[i][j+1] == 1) {
            tot +=help(grid,m,n,i,j+1);
        }
        if ( i > 0 && grid[i-1][j] == 1) {
            tot +=help(grid,m,n,i-1,j);
        }
        if ( j > 0 && grid[i][j-1] == 1) {
            tot +=help(grid,m,n,i,j-1);
        }
        if (flag) return 0;
        return tot;
    }

    public int numEnclaves(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    // boolean[] vis[] = new boolean[grid.length][grid[0].length];
                    ans += help(grid,grid.length-1,grid[0].length-1,i,j);
                    flag = false;
                }
            }
        }
        return ans;
    }
}