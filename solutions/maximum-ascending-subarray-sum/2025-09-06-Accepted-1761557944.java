/*
 * Submission: 1761557944
 * Problem: Maximum Ascending Subarray Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:28:17 UTC
 * Runtime: 0 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0, len = nums.length, prev = -1, cur = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] <= prev) {
                cur = 0;
            }
            cur += nums[i];
            prev = nums[i];
            max = Math.max(cur,max);
        } return max;
    }
}