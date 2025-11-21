/*
 * Submission: 1761509111
 * Problem: Teemo Attacking (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 13:34:01 UTC
 * Runtime: 3 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0, len = timeSeries.length;
        for (int i = 0; i < len - 1; i++) {
            ans += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        return ans + duration;
    }
}
