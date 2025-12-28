/*
 * Submission: 1706134166
 * Problem: Widest Vertical Area Between Two Points Containing No Points (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 15:45:17 UTC
 * Runtime: 39 ms
 * Memory: 73.2 MB
 */

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0; i < points.length - 1; i++){
            max = Math.max(max,points[i+1][0]-points[i][0]);
        }
        return max;
    }
}