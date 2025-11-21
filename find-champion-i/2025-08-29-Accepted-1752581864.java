/*
 * Submission: 1752581864
 * Problem: Find Champion I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 15:41:22 UTC
 * Runtime: 0 ms
 * Memory: 45.7 MB
 */

class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int champ = 0;
        for (int i = 1; i < n; i++) {
            if (grid[champ][i] == 0) {
                champ = i;
            }
        }
        return champ;
    }
}