/*
 * Submission: 1605749668
 * Problem: Minimum Number of Arrows to Burst Balloons (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-13 15:50:40 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> a[1] - b[1]);
        int curEnd = points[0][1];
        int shots = 1;
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > curEnd){
                shots++;
                curEnd = points[i][1];
            }
        }
        return  shots;
    }
}