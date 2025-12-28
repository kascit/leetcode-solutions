/*
 * Submission: 1749692257
 * Problem: Row With Maximum Ones (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-27 03:16:00 UTC
 * Runtime: 4 ms
 * Memory: 46.9 MB
 */

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int c = 0;
            for (int n : mat[i]) {
                if (n==1) c++;
            }
            if (c > ans[1]) {
                ans[1] = c;
                ans[0] = i;
            }
        } return ans;
    }
}