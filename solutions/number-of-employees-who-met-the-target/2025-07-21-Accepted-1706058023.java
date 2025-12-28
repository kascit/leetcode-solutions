/*
 * Submission: 1706058023
 * Problem: Number of Employees Who Met the Target (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 14:40:53 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt = 0;
        for (int h : hours){
            if ( h >= target) cnt++;
        }

        return cnt;
    }
}