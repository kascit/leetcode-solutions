/*
 * Submission: 1604606915
 * Problem: Longest Subarray of 1's After Deleting One Element (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 14:41:07 UTC
 * Runtime: 3 ms
 * Memory: 57 MB
 */

class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeroCount = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;

            while (zeroCount > 1) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }

            // The current window is valid with at most one zero, delete one element
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
