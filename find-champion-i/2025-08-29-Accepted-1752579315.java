/*
 * Submission: 1752579315
 * Problem: Find Champion I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 15:38:48 UTC
 * Runtime: 0 ms
 * Memory: 45.5 MB
 */

class Solution {
    public int findChampion(int[][] grid) {
        int idx = 0;
        for (int[] g : grid){
            int z = 0;
            for (int i : g){
                if (i == 0) z++;
                if (z > 1) break;
            }
            if (z == 1) return idx;
            idx++;
        } return idx;
    }
}