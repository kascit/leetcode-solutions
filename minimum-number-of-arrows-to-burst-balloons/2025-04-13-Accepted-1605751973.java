/*
 * Submission: 1605751973
 * Problem: Minimum Number of Arrows to Burst Balloons (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 15:53:39 UTC
 * Runtime: 51 ms
 * Memory: 69 MB
 */

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[1], b[1]));
        int curEnd = points[0][1];
        int shots = 1;
        for(int i = 1; i < points.length; i++){
            if( points[i][0] >  curEnd){
                shots++;
                curEnd = points[i][1];
            }
        }
        return  shots;
    }
}