/*
 * Submission: 1722885299
 * Problem: Max Increase to Keep City Skyline (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-04 09:47:46 UTC
 * Runtime: 1 ms
 * Memory: 44.5 MB
 */

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int len = grid.length;
        int[] maxRC = new int[len*2];
        for (int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                maxRC[j] = (maxRC[j] > grid[i][j]) ? maxRC[j] : grid[i][j];
            }
        }
        for (int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                maxRC[i+len] = (maxRC[i+len] > grid[i][j]) ? maxRC[i+len] : grid[i][j];
            }
            
        }
        int ans = 0;
        for (int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if (maxRC[len+i] < maxRC[j]){
                    ans = ans - grid[i][j] + maxRC[len+i];
                    grid[i][j] = maxRC[len+i];
                    
                } else{
                    ans = ans - grid[i][j] + maxRC[j];
                    grid[i][j] = maxRC[j];
                }
            }
            
        } 

        // for (int i = 0; i < len; i++){
        //     for(int j = 0; j < len; j++){
        //         System.out.print(grid[i][j]);
        //     } System.out.println();
            
        // }
         return ans;



    }
}