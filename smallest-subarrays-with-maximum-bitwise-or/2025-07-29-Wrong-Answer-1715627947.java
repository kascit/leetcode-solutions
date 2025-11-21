/*
 * Submission: 1715627947
 * Problem: Smallest Subarrays With Maximum Bitwise OR (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-29 09:56:40 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int maxOR = 0, len = nums.length;
        for (int i : nums) maxOR |= i;
        for (int i = 0; i < len; i++){
            int curOR = nums[i], j = i+1;
            while(j < len && curOR != maxOR){
                curOR |= nums[j++];
            }
            nums[i] = j - i;
        }
        return nums;
    }
}