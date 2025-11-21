/*
 * Submission: 1605679204
 * Problem: Find the Highest Altitude (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 14:20:36 UTC
 * Runtime: 0 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length + 1];
        ans[0] = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++){
            ans[i+1] = ans[i] + gain[i];
            max = (max > ans[i]) ? max : ans[i];
        }
        max = (max > ans[gain.length]) ? max : ans[gain.length];
        return max;
    }
}