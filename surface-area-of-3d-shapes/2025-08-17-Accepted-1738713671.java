/*
 * Submission: 1738713671
 * Problem: Surface Area of 3D Shapes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 16:10:26 UTC
 * Runtime: 5 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int surfaceArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(grid[i][j] != 0) ans += 2; //top bottom
                // System.out.print(i +"  " + j + " top&bottom: " + ans);
                //right
                //bottom
                if (j == n-1) ans += grid[i][j];
                if (i == m-1) ans += grid[i][j];
                // System.out.print("  right & down: "+ans);
                //up
                if (i == 0) ans += grid[i][j];
                else {
                    ans += (grid[i][j] > grid[i-1][j]) ? grid[i][j] - grid[i-1][j]: grid[i-1][j] - grid[i][j];
                }
                // System.out.print("  up: "+ans);
                //left
                if (j == 0) ans += grid[i][j];
                else {
                    ans += (grid[i][j] > grid[i][j-1]) ? grid[i][j] - grid[i][j-1]: grid[i][j-1] - grid[i][j];
                }
                // System.out.print("  left: "+ans);
                // System.out.println();
            }
        } return ans;
    }
}