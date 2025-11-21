/*
 * Submission: 1706950760
 * Problem: Running Sum of 1d Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-22 08:10:23 UTC
 * Runtime: 0 ms
 * Memory: 42.7 MB
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int sum =  0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}