/*
 * Submission: 1760825537
 * Problem: Find the Width of Columns of a Grid (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 19:06:25 UTC
 * Runtime: 10 ms
 * Memory: 46.4 MB
 */

class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[] ans = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int cur = grid[i][j];
                int len = 0;
                if (cur <= 0) {len += 1; cur *= -1;}
                int ten = 0;
                while (Math.pow(10,ten) <= cur) ten++;
                len += ten;
                ans[j] = Math.max(ans[j],len);
            }
        } return ans;
    }
}