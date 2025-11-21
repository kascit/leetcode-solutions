/*
 * Submission: 1730260223
 * Problem: Minimum Time Visiting All Points (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:25:09 UTC
 * Runtime: 1 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        if (points.length < 2) {
            return 0;
        }
        for (int i = 0; i < points.length - 1; i++){
            ans += Math.max(
                ((points[i+1][0]-points[i][0]) > 1) ? (points[i+1][0]-points[i][0]) : -1*(points[i+1][0]-points[i][0]),
                ((points[i+1][1]-points[i][1]) > 1) ? (points[i+1][1]-points[i][1]) : -1*(points[i+1][1]-points[i][1])
                );
        } return ans;
    }
}