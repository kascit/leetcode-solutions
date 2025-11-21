/*
 * Submission: 1605890100
 * Problem: House Robber (Medium)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-04-13 18:30:18 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int first = nums[0];
        int second = (first > nums[1]) ? first : nums[1];
        for (int i = 2; i < nums.length; i++){
            ans[i] = (second > nums[i] + first) ? second : nums[i] + first;
            first = second;
            second = ans[i];
        }
        return ans[n-1];
    }
}