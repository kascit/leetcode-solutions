/*
 * Submission: 1761371619
 * Problem: Modify the Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 10:42:55 UTC
 * Runtime: 1 ms
 * Memory: 45.9 MB
 */

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for (int j = 0; j < cols; j++){
            int max = -1;
            List<Integer> itr = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                int cur = matrix[i][j];
                max = Math.max(cur,max);
                if (cur == -1) itr.add(i);
            }

            for (int it : itr) {
                matrix[it][j] = max;
            }
        } return matrix;
    }
}