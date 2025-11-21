/*
 * Submission: 1735118483
 * Problem: Maximum Sum With Exactly K Elements  (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 16:03:37 UTC
 * Runtime: 1 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = -1;
        for(int i : nums){
            max = (max >i) ? max : i;
        }
        return max*k + k*(k-1)/2;
    }
}