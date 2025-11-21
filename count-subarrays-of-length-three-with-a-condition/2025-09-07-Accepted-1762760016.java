/*
 * Submission: 1762760016
 * Problem: Count Subarrays of Length Three With a Condition (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 14:39:28 UTC
 * Runtime: 1 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int countSubarrays(int[] nums) {
        int len = nums.length, ans = 0, prev = nums[0], cur = nums[1];
        for (int i = 1; i < len - 1; i++) {
            int next = nums[i+1];
            // System.out.println(prev+"  "+cur+"  "+next);
            if ((cur&1)==0&&cur/2 == prev + next) ans++;
            prev = cur;
            cur = next;
        } return ans;
    }
}