/*
 * Submission: 1757124577
 * Problem: Minimum Pair Removal to Sort Array I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-02 14:24:23 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minimumPairRemoval(int[] nums) {
        int r = nums.length - 1, ans = 0;
        for (int i = r; i >= 1; i--) {
            if (nums[i-1] > nums[i]) {
                nums[i-1] += nums[i];
                ans++;
            }
        } return ans;
    }
}