/*
 * Submission: 1716562264
 * Problem: Longest Subarray With Maximum Bitwise AND (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 04:01:32 UTC
 * Runtime: 2 ms
 * Memory: 59.3 MB
 */

class Solution {
    public int longestSubarray(int[] nums) {
        int maxOR = 0, maxLen = 0, len = nums.length;
        for (int i : nums) maxOR = (maxOR > i) ? maxOR : i;
        for (int i = 0; i < len; i++){
            int cur = 0;
            while (i < len && nums[i] != maxOR) i++;
            while (i < len && nums[i] == maxOR) {i++; cur++;}
            maxLen = (maxLen > cur) ? maxLen : cur;
        }
        return maxLen;
    }
}