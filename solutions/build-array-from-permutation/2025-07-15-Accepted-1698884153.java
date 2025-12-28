/*
 * Submission: 1698884153
 * Problem: Build Array from Permutation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 14:14:24 UTC
 * Runtime: 1 ms
 * Memory: 45.7 MB
 */

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}