/*
 * Submission: 1772832563
 * Problem: Earliest Time to Finish One Task (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-16 14:38:55 UTC
 * Runtime: 1 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = 200;
        for (int[] t : tasks) {
            ans = Math.min(ans,t[0]+t[1]);
        } return ans;
    }
}