/*
 * Submission: 1706059075
 * Problem: Number of Employees Who Met the Target (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 14:41:47 UTC
 * Runtime: 0 ms
 * Memory: 42.2 MB
 */

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count =0;
        for(int i=0;i<hours.length;i++)
        {
            if(hours[i] >= target)
            {
                count++;
            }
        }
        return count;
    }
}