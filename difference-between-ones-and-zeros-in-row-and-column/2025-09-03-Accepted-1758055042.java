/*
 * Submission: 1758055042
 * Problem: Difference Between Ones and Zeros in Row and Column (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 09:47:17 UTC
 * Runtime: 6 ms
 * Memory: 80 MB
 */

class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[] or = new int[rows], zr = new int[rows], oc = new int[cols], zc = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    oc[j]++;
                    or[i]++;
                } else {
                    zc[j]++;
                    zr[i]++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = or[i] + oc[j] - zr[i] - zc[j];
            }
        } return grid;

    }
}