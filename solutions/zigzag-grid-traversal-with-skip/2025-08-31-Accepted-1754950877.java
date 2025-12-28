/*
 * Submission: 1754950877
 * Problem: Zigzag Grid Traversal With Skip (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 16:12:04 UTC
 * Runtime: 1 ms
 * Memory: 45.5 MB
 */

class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        int rows = grid.length, cols = grid[0].length;
        boolean right = true;
        for (int i = 0, j = 0; i < rows;) {
            if (((i+j)&1) == 0) ans.add(grid[i][j]);
            // System.out.println(grid[i][j]);
            if (right) {
                if (j == cols - 1) {
                    i++;
                    right = false;
                } else j++;
            } else {
                if (j == 0) {
                    i++;
                    right = true;
                } else j--;
            }
        } return ans;
    }
}