/*
 * Submission: 1761510514
 * Problem: Teemo Attacking (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 13:35:40 UTC
 * Runtime: 2 ms
 * Memory: 44.7 MB
 */

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) return 0;
        
        int ans = 0;
        int end = 0;
        
        for (int t : timeSeries) {
            if (t >= end) {
                ans += duration;
            } else {
                ans += t + duration - end;
            }
            end = t + duration;
        }
        
        return ans;
    }
}
