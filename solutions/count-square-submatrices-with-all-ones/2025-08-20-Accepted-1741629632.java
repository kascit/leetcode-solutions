/*
 * Submission: 1741629632
 * Problem: Count Square Submatrices with All Ones (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-20 04:57:18 UTC
 * Runtime: 7 ms
 * Memory: 56.2 MB
 */

class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int ans = 0;
        // boolean[][] matrixNext = new boolean[rows][cols]; 
        // int[][] matrix = new int[rows][cols]; 
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        // System.out.println(ans);

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        // matrix[i][j] += 1;
                        continue;
                    }
                    else if (matrix[i-1][j-1] >= 1){
                        // System.out.println(i+"   "+j);
                        // System.out.println(matrix[i-1][j]);
                        // System.out.println(matrix[i-1][j-1]);
                        // System.out.println(matrix[i][j-1]);

                        matrix[i][j] = 1 + Math.min(
                            matrix[i-1][j],
                            Math.min(
                                matrix[i-1][j-1],
                                matrix[i][j-1]
                                )
                            );
                    }
                }
            }
        }

        // for(int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println(); 
        // }

        // System.out.println("DP:");
        // for (int i = 0; i < matrix.length; i++) {          
        //     for (int j = 0; j < matrix[i].length; j++) {   
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println(); 
        // }
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans+=matrix[i][j];
            }
        }
        return ans;

    }
}