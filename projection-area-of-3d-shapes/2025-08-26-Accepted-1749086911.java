/*
 * Submission: 1749086911
 * Problem: Projection Area of 3D Shapes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-26 14:18:23 UTC
 * Runtime: 3 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int projectionArea(int[][] grid) {
        int top = 0, colM = 0, rowM = 0;
        for(int i =0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) top++;
                max = Math.max(max,grid[i][j]);    
            }
            rowM += max;
        }
        for(int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                // if (grid[i][j] > 0) top++;
                max = Math.max(max,grid[j][i]);    
            }
            colM += max;
        } 
        // System.out.println(colM+" "+top+" "+rowM);
        return colM + top + rowM;
    }
}