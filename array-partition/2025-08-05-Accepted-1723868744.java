/*
 * Submission: 1723868744
 * Problem: Array Partition (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 04:39:36 UTC
 * Runtime: 12 ms
 * Memory: 46.5 MB
 */

class Solution {
    public int arrayPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i+=2){
            ans += nums[i];
        } return ans;
    }
}