/*
 * Submission: 1748507571
 * Problem: Maximum Area of Longest Diagonal Rectangle (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-26 04:21:11 UTC
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
                ans = (py[0]*py[1]);
                pythagoras = cur;
            }
        } return ans;
    }
}