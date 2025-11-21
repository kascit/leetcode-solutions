/*
 * Submission: 1716632234
 * Problem: Minimum Operations to Exceed Threshold Value I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 05:11:48 UTC
 * Runtime: 0 ms
 * Memory: 43.1 MB
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i] < k){
                count++;
            }
        }
        return count;
    }
}