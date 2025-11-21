/*
 * Submission: 1758119941
 * Problem: Flood Fill (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 11:05:17 UTC
 * Runtime: 0 ms
 * Memory: 45 MB
 */

class Solution {
    int color, check, rows, cols;
    boolean[][] done;
    int[][] dum;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.rows = image.length;
        this.cols = image[0].length;
        this.dum = image;
        this.color = color;
        this.check = image[sr][sc];
        this.done = new boolean[rows][cols];
        doi(sr,sc);
        return image;
    }

    private void doi(int i, int j) {
        if (dum[i][j] != check) return;
        dum[i][j] = color;
        done[i][j] = true;
        if ( i > 0 && !done[i-1][j]) doi(i-1,j);
        if ( i < rows - 1 && !done[i+1][j]) doi(i+1,j);
        if ( j > 0 && !done[i][j-1]) doi(i,j-1);
        if ( j < cols - 1 && !done[i][j+1]) doi(i,j+1);
    }
}