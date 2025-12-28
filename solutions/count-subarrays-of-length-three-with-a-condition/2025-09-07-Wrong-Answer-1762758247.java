/*
 * Submission: 1762758247
 * Problem: Count Subarrays of Length Three With a Condition (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 14:37:30 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int countSubarrays(int[] nums) {
        int len = nums.length, ans = 0, prev = nums[0], cur = nums[1];
        for (int i = 1; i < len - 1; i++) {
            int next = nums[i+1];
            // System.out.println(prev+"  "+cur+"  "+next);
            if (cur/2 == prev + next) ans++;
            prev = cur;
            cur = next;
        } return ans;
    }
}