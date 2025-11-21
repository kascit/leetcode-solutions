/*
 * Submission: 1748505824
 * Problem: Maximum Area of Longest Diagonal Rectangle (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-26 04:19:24 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans= 0, pythagoras = 0;
        for (int[] py : dimensions) {
            int cur = (int) Math.sqrt(py[0]*py[0] + py[1]*py[1]);
            if(cur > pythagoras) {
                ans = (py[0]*py[1]);
                pythagoras = cur;
            }
        } return ans;
    }
}