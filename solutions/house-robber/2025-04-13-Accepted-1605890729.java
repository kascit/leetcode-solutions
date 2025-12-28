/*
 * Submission: 1605890729
 * Problem: House Robber (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 18:30:57 UTC
 * Runtime: 0 ms
 * Memory: 40.9 MB
 */

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int first = nums[0];
        if (n == 1) return first;
        int second = (first > nums[1]) ? first : nums[1];
        if (n==2) return second;
        for (int i = 2; i < nums.length; i++){
            ans[i] = (second > nums[i] + first) ? second : nums[i] + first;
            first = second;
            second = ans[i];
        }
        return ans[n-1];
    }
}