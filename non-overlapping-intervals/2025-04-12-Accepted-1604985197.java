/*
 * Submission: 1604985197
 * Problem: Non-overlapping Intervals (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 21:15:34 UTC
 * Runtime: 45 ms
 * Memory: 73.5 MB
 */

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int prev = 0;
        int cnt = 1;

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= intervals[prev][1]) {
                prev = i;
                cnt++;
            }
        }
        
        return n - cnt;
    }
}