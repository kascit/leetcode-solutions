/*
 * Submission: 1705774684
 * Problem: Transform Array by Parity (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-07-21 10:03:08 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if ((nums[i]&1) == 0) cnt++;
        }

        for(int i = cnt - 1; i < nums.length; i++){
            ans[i] = 1;
        }

        return ans;
    }
}