/*
 * Submission: 1762868660
 * Problem: Number of Equivalent Domino Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 16:31:08 UTC
 * Runtime: 2 ms
 * Memory: 53.2 MB
 */

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] countArr = new int[100]; // since key max = 9*10+9 = 99
        int count = 0;

        for (int[] d : dominoes) {
            int a = d[0], b = d[1];
            int key = a < b ? a * 10 + b : b * 10 + a; // normalize

            count += countArr[key]; // each existing domino forms a new pair
            countArr[key]++;        // increase frequency
        }

        return count;
    
        
    }
}