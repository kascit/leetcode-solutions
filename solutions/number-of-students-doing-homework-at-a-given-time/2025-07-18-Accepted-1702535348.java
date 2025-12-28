/*
 * Submission: 1702535348
 * Problem: Number of Students Doing Homework at a Given Time (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 14:55:39 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;
        for (int i = 0; i < endTime.length; i++){
            if (startTime[i] <= queryTime ){
                cnt++;
                if ( endTime[i] < queryTime ){
                    cnt--;
                }
            }
        }
        return cnt;
    }
}