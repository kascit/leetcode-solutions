/*
 * Submission: 1748508237
 * Problem: Maximum Area of Longest Diagonal Rectangle (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-26 04:21:53 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans= 0;
        double pythagoras = 0;
        for (int[] py : dimensions) {
            double cur = Math.sqrt(py[0]*py[0] + py[1]*py[1]);
            if(cur >= pythagoras) {
                ans = Math.max(ans,(py[0]*py[1]));
                pythagoras = cur;
            }
        } return ans;
    }
}