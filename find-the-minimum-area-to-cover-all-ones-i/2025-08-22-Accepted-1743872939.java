/*
 * Submission: 1743872939
 * Problem: Find the Minimum Area to Cover All Ones I (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-22 03:43:32 UTC
 * Runtime: 5 ms
 * Memory: 158.6 MB
 */

class Solution {
    public int minimumArea(int[][] grid) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = 0, maxY = 0;
        int rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    minX = (minX < i) ? minX : i;
                    minY = (minY < j) ? minY : j;
                    maxX = (maxX < i) ? i : maxX;
                    maxY = (maxY < j) ? j : maxY;
                }
            }
        }
        // System.out.println(minX +"   " + minY);
        // System.out.println(maxX +"   " + maxY);
        return (maxX-minX + 1)*(maxY-minY+1);
    }
}