/*
 * Submission: 1748509952
 * Problem: Maximum Area of Longest Diagonal Rectangle (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-26 04:23:40 UTC
 * Runtime: 1 ms
 * Memory: 44.3 MB
 */

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans= 0;
        double pythagoras = 0;
        for (int[] py : dimensions) {
            double cur = Math.sqrt(py[0]*py[0] + py[1]*py[1]);
            if(cur >= pythagoras) {
                if (cur == pythagoras) {
                    ans = Math.max(ans,py[0]*py[1]);
                } else ans = py[0]*py[1];
                pythagoras = cur;
            }
        } return ans;
    }
}