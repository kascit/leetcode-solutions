/*
 * Submission: 1831324385
 * Problem: Matrix Similarity After Cyclic Shifts (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 12:48:58 UTC
 * Runtime: 1 ms
 * Memory: 47.1 MB
 */

class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int shifts = k%m;
        // int [][] chcha = new int[len][len];

        // System.out.println(shifts);
        boolean even = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++ ){
                // System.out.println(i + "    " + j);
                if(even) {
                    if (mat[i][(j+shifts)%m] != mat[i][j]) {
                        // System.out.println(mat[i][(j+shifts)%len] + "    " + mat[i][j]);
                        // System.out.println((j+shifts) + "    " + j);
                        return false;
                    }
                } else {
                    if (mat[i][(m+j-shifts)%m] != mat[i][j]) {
                        // System.out.println(mat[i][(len+j-shifts)%len] + "    " + mat[i][j]);
                        return false;
                    }
                }
            } even = !even;
        } return true;
    }
}