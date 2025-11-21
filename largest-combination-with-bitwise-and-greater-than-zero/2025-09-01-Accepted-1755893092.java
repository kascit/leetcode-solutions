/*
 * Submission: 1755893092
 * Problem: Largest Combination With Bitwise AND Greater Than Zero (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-01 13:57:29 UTC
 * Runtime: 13 ms
 * Memory: 57.2 MB
 */

class Solution {
    public int largestCombination(int[] candidates) {
        int[] bits = new int[32];
        int ans = 0;
        for (int c : candidates) {
            int i = 0;
            while (c > 0) {
                bits[i] += c&1;
                ans = Math.max(ans,bits[i]);
                i++;
                c>>=1;
            }
        } return ans;
    }
}