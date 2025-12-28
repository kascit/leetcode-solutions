/*
 * Submission: 1605676751
 * Problem: Find the Highest Altitude (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-13 14:17:39 UTC
 * Runtime: N/A
 * Memory: N/A
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
        return max;
    }
}