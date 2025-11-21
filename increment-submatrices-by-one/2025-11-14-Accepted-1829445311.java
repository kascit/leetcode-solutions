/*
 * Submission: 1829445311
 * Problem: Increment Submatrices by One (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-14 08:24:16 UTC
 * Runtime: 659 ms
 * Memory: 77.1 MB
 */

class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[2]; i++) {
                for (int j = query[1]; j <= query[3]; j++) {
                    ans[i][j]++;
                }
            }
        } return ans;
    }
}