/*
 * Submission: 1705459871
 * Problem: Convert 1D Array Into 2D Array (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-21 04:46:40 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) return new int[0][0];
        int[][] ans = new int[m][n];
        int j = 0;
        for (int i = 0; i < original.length; i++){
            ans[j][i%n] = original[i];
            if (i == n - 1) j++; 
        }

        return ans;
    }
}