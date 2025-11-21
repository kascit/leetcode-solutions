/*
 * Submission: 1741610204
 * Problem: Count Square Submatrices with All Ones (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-20 04:34:42 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int ans = 0;
        // boolean[][] canEndNext = new boolean[rows][cols]; 
        int[][] canEnd = new int[rows][cols]; 
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 1) {
                    canEnd[i][j] = 1;
                }
            }
        }
        System.out.println(ans);

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        // canEnd[i][j] += 1;
                        continue;
                    }
                    else if (matrix[i-1][j-1] == 1){
                        System.out.println(i+"   "+j);
                        canEnd[i][j] = 1 + Math.min(canEnd[i-1][j],canEnd[i][j-1]);
                    }
                }
            }
        }
        for (int i = 0; i < canEnd.length; i++) {          
            for (int j = 0; j < canEnd[i].length; j++) {   
                System.out.print(canEnd[i][j] + " ");
            }
            System.out.println(); 
        }
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans+=canEnd[i][j];
            }
        }
        return ans;

    }
}