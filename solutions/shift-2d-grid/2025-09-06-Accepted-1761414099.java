/*
 * Submission: 1761414099
 * Problem: Shift 2D Grid (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:34:02 UTC
 * Runtime: 8 ms
 * Memory: 45.6 MB
 */

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(cols, 0));
            ans.add(row);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int c = j + k;
                int r = i;
                if (c >= cols) {
                    r += c/cols;
                    c %= cols;
                }
                r %= rows;
                ans.get(r).set(c,grid[i][j]);
            }
        } return ans;
    }
}