/*
 * Submission: 1740340045
 * Problem: Number of Zero-Filled Subarrays (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-19 03:56:54 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int ans = 0, c = 0;
        int i = 0, len = nums.length;
        while(i < len){
            if (nums[i] == 0){
                c++;
            }
            else {
                ans += c*(c+1)/2;
                c = 0;
            }
            i++;
        } 
        ans += c*(c+1)/2;
        return ans;
    }
}