/*
 * Submission: 1602617191
 * Problem: Rearrange Array Elements by Sign (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 11:33:35 UTC
 * Runtime: 3 ms
 * Memory: 76.9 MB
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
         int[] ans = new int[nums.length];
        int p = 0, n = 1, s = nums.length;
        for (int i = 0; i < s; i++){
            if(nums[i] >= 0) {ans[p] = nums[i]; p += 2;}
            else {ans[n] = nums[i]; n += 2;}
        }
        return ans;
    }
}