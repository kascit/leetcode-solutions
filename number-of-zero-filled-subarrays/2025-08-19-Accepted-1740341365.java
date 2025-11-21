/*
 * Submission: 1740341365
 * Problem: Number of Zero-Filled Subarrays (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-19 03:58:30 UTC
 * Runtime: 3 ms
 * Memory: 62.2 MB
 */

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0, c = 0;
        int i = 0, len = nums.length;
        // System.out.println(len);
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
        // System.out.println(c);
        ans += c*(c+1)/2;
        return ans;
    }
}