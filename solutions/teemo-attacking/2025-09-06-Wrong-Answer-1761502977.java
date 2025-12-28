/*
 * Submission: 1761502977
 * Problem: Teemo Attacking (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-06 13:26:58 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0, len = timeSeries.length, end = -1;
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && timeSeries[i+1] == timeSeries[i]) {
                i++;
                continue;
            }
            if (end >= timeSeries[i]) {
                ans -= end - timeSeries[i] + 1;
            }
            ans += duration;
            end = timeSeries[i] + duration - 1;
        } return ans;
    }
}