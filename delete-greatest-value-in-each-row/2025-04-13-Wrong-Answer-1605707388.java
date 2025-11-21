/*
 * Submission: 1605707388
 * Problem: Delete Greatest Value in Each Row (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-13 14:55:35 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int gl = 0, max = 0, res = 0, mi = 0, mj =0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] > max){
                    mi = i; mj = j;
                    max = grid[i][j];
                }
            }
            grid[mi][mj] = 0;
            gl = Math.max(gl,max);
            res += gl;
        }
        return res;
    }
}