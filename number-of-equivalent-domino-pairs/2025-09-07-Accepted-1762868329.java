/*
 * Submission: 1762868329
 * Problem: Number of Equivalent Domino Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 16:30:49 UTC
 * Runtime: 3 ms
 * Memory: 52.5 MB
 */

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int num[] = new int[100];
        int res = 0;
        for(int[] domino : dominoes){
            int val = domino[0] < domino[1] 
            ? domino[0] * 10 + domino[1] 
            : domino[1] * 10 + domino[0];
            res += num[val];
            num[val]++;
        }
        return res;
    }
}