/*
 * Submission: 1761414364
 * Problem: Shift 2D Grid (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:34:25 UTC
 * Runtime: 8 ms
 * Memory: 45.4 MB
 */

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length, cols = grid[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < rows; i++) {
            ans.add(new ArrayList<>(Collections.nCopies(cols, 0)));
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int c = (j + k) % cols;
                int r = (i + (j + k) / cols) % rows;
                ans.get(r).set(c, grid[i][j]);
            }
        }
        return ans;
    }
}
