/*
 * Submission: 1741637534
 * Problem: Count Square Submatrices with All Ones (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-20 05:05:56 UTC
 * Runtime: 7 ms
 * Memory: 56.4 MB
 */

class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int ans = 0;
        // boolean[][] matrixNext = new boolean[rows][cols]; 
        // int[][] matrix = new int[rows][cols]; 
        // for(int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if(matrix[i][j] == 1) {
        //             matrix[i][j] = 1;
        //         }
        //     }
        // }
        // System.out.println(ans);

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 1) {
                    if (i > 0 && j > 0) {
                        int minNeighbor = (matrix[i-1][j] > matrix[i][j-1]) ? matrix[i][j-1] : matrix[i-1][j];
                        matrix[i][j] = 1 + ((minNeighbor > matrix[i-1][j-1]) ? matrix[i-1][j-1] : minNeighbor);
                    }
                }
                ans+= matrix[i][j];
            }
        }
        return ans;
    }
}