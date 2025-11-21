/*
 * Submission: 1747795897
 * Problem: Make a Square with the Same Color (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-25 14:01:11 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int[][] n = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j] += (grid[i][j] == 'B') ? 1 : -1;
                if (i>0 && j >0) {
                    n[i][j] += 
                        ((grid[i-1][j] == 'B') ? 1 : -1)
                    +   ((grid[i-1][j-1] == 'B') ? 1 : -1)
                    +   ((grid[i][j-1] == 'B') ? 1 : -1);
                }
                if (n[i][j] == -2 || n[i][j] == 2) return true;
            }
        } return false;
    }
}