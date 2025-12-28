/*
 * Submission: 1754944406
 * Problem: Zigzag Grid Traversal With Skip (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-31 16:05:27 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        int rows = grid.length, cols = grid[0].length;
        boolean even = true;
        for (int i = 0, j = 0; i < rows;) {
            ans.add(grid[i][j]);
            j+=2;
            if (j>=cols) {
                if (even) j = 1;
                else j = 0;
                i++;
                even = !even;
            }

        } return ans;
    }
}