/*
 * Submission: 1700940600
 * Problem: Score After Flipping Matrix (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 06:33:08 UTC
 * Runtime: 0 ms
 * Memory: 42 MB
 */

class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++){
            boolean flipRow = false;
            if(grid[i][0] == 0){
                flipRow = true;
            }
            if (flipRow) {
                for (int j = 0; j < cols; j++){
                    grid[i][j] = (grid[i][j] == 0) ? 1 : 0;
                }
            }
        }

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(grid[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for (int j = 0; j < cols; j++){
            int count = 0;
            for (int i = 0; i < rows; i++){
                if(grid[i][j] == 0) count++;
                else count--;
            }
            if (count > 0){
                for (int i = 0; i < rows; i++){
                    grid[i][j] = (grid[i][j] == 0) ? 1 : 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = 2*sum + grid[i][j];

            }
            ans += sum;
        }


        return ans;


    }
}