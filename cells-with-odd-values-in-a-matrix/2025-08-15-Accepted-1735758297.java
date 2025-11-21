/*
 * Submission: 1735758297
 * Problem: Cells with Odd Values in a Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 06:48:11 UTC
 * Runtime: 2 ms
 * Memory: 41.7 MB
 */

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int c = 0;
        for(int[] dod : indices){
            for(int i = 0; i < m; i++){
                ans[i][dod[1]]++;
            }
            for(int i = 0; i < n; i++){
                ans[dod[0]][i]++;
            }
        }

        for(int i[] : ans) {
            for(int j : i){
                // System.out.print(j);
                if ((j&1) == 1) c++;
            }
                // System.out.println();
        } return c;
    }
}