/*
 * Submission: 1716740229
 * Problem: Sum of Variable Length Subarrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 06:48:12 UTC
 * Runtime: 1 ms
 * Memory: 43.6 MB
 */

class Solution {
    public int subarraySum(int[] nums) {
        int sum = 0, len = nums.length;
        for (int i = 0; i < len; i++){
            int start = Math.max(0,i-nums[i]);
            while(start <= i){
                sum += nums[start++];
            }
        }
        return sum;
    }
}