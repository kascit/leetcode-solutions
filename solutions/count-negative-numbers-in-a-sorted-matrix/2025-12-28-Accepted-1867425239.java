/*
Submission: 1867425239
Status: Accepted
Timestamp: 2025-12-28 09:04:36 UTC
Runtime: 1 ms
Memory: 47.2 MB
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int cnt = 0;
        for(int i = 0; i < rows; i++){
            for (int j = cols-1; j >= 0; j--){
               if (i > 0 && grid[i-1][j] < 0)
                    continue;
                else if (grid[i][j] >= 0) break; 
                else cnt+= rows - i;
            }
        } return cnt;
    }
}