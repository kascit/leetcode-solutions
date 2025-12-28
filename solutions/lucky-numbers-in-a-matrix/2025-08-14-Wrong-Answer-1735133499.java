/*
 * Submission: 1735133499
 * Problem: Lucky Numbers in a Matrix (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-14 16:18:17 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        int min = (int) 1e9;
        for(int i = 0; i < m[0].length; i++){
            int max = -1;
            for (int j =0; j < m.length; j++){
                max = (max > m[j][i]) ? max : m[j][i];
            }
                // System.out.println(max);
            min = (max < min) ? max : min;
        }
        return List.of(min);
    }
}