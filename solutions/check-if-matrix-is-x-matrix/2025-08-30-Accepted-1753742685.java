/*
 * Submission: 1753742685
 * Problem: Check if Matrix Is X-Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 15:52:48 UTC
 * Runtime: 2 ms
 * Memory: 45.2 MB
 */

class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cur = grid[i][j];
                if (i-j == 0 || i+j == n-1){
                    if (cur == 0) return false;
                } else {
                    if (cur != 0) return false;
                }
            }
        } return true;
    }
}