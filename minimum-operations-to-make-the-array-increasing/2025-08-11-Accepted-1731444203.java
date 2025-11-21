/*
 * Submission: 1731444203
 * Problem: Minimum Operations to Make the Array Increasing (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:16:40 UTC
 * Runtime: 3 ms
 * Memory: 45 MB
 */

class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length, ans = 0;
        if (len == 1) return 0;
        for (int i = 1; i < len; i++){
            if(nums[i-1] >= nums[i]) {
                ans += nums[i-1] - nums[i] + 1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return ans;
    }
}