/*
 * Submission: 1604564864
 * Problem: Max Consecutive Ones III (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 14:07:19 UTC
 * Runtime: 3 ms
 * Memory: 46.9 MB
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLength = 0, zeroCount = 0;
        for (int right = 0; right < nums.length; ++right) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}