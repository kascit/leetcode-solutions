/*
 * Submission: 1758069318
 * Problem: Special Positions in a Binary Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:03:34 UTC
 * Runtime: 2 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int numSpecial(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[] or = new int[rows], oc = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    or[i]++;
                    oc[j]++;
                }
            }
        }
        int ans  = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1 && or[i] == 1 && oc[j] == 1) {
                    ans++;
                }
            }
        } return ans;
    } 
}