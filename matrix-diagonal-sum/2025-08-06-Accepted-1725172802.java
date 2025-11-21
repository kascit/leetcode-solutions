/*
 * Submission: 1725172802
 * Problem: Matrix Diagonal Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 04:40:30 UTC
 * Runtime: 1 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length, prim = 0, sec = 0, mid = 0;
        if ((len&1) == 1){
            mid = mat[len/2][len/2];
        }
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++){
                if (i==j) prim += mat[i][j];
                if (i+j == len - 1) sec += mat[i][j];
            }
        return sec + prim - mid;
    }
}