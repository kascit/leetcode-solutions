/*
 * Submission: 1761366055
 * Problem: Toeplitz Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 10:36:21 UTC
 * Runtime: 0 ms
 * Memory: 44.1 MB
 */

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for(int i = 0; i < rows; i++) {
            int x = i, y = 0;
            int elem = matrix[x++][y++];
            while(x < rows && y < cols) {
                if (matrix[x++][y++] != elem) return false;
            }
        }
        for(int j = 1; j < cols; j++) {
            int x = 0, y = j;
            int elem = matrix[x++][y++];
            while(x < rows && y < cols) {
                if (matrix[x++][y++] != elem) return false;
            }
        } return true;
    }
}