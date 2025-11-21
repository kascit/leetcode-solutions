/*
 * Submission: 1746211545
 * Problem: Lucky Numbers in a Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 05:35:05 UTC
 * Runtime: 2 ms
 * Memory: 45.7 MB
 */

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        
        for (int i = 0; i < m; i++) {
            // Step 1: Find min in row i
            int minVal = Integer.MAX_VALUE;
            int colIdx = -1;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIdx = j;
                }
            }
            
            // Step 2: Check if minVal is max in its column
            boolean isLucky = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIdx] > minVal) {
                    isLucky = false;
                    break;
                }
            }
            
            if (isLucky) res.add(minVal);
        }
        
        return res;
    }
}