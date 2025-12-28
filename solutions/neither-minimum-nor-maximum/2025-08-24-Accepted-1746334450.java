/*
 * Submission: 1746334450
 * Problem: Neither Minimum nor Maximum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 07:37:31 UTC
 * Runtime: 4 ms
 * Memory: 45 MB
 */

class Solution {
    public int findNonMinOrMax(int[] nums) {
        int len = nums.length;
        if (len < 3) return -1;
        int min = 101, max = 0, ans = -1;
        for(int i = 0; i < 3; i++){
            if (nums[i] < min) {
                ans = min;
                min = nums[i];
            } 
            if (nums[i] > max) {
                ans = max;
                max = nums[i];
            }
            if (nums[i] != max && nums[i] != min) {
                ans = nums[i];
            }
        } return ans;
    }
}