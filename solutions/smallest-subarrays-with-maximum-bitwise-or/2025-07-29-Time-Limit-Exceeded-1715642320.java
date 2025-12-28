/*
 * Submission: 1715642320
 * Problem: Smallest Subarrays With Maximum Bitwise OR (Medium)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-07-29 10:10:02 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int maxOR = 0, len = nums.length;
        int[] ans = new int[len];
        for (int i = len - 1; i >= 0; i--){
            int curOR = nums[i], j = i+1;
            maxOR |= curOR;
            while(j < len && curOR != maxOR){
                curOR |= nums[j++];
            }
            ans[i] = j - i;
        }
        return ans;
    }
}