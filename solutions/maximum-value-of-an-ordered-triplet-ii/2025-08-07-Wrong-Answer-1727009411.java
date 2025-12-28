/*
 * Submission: 1727009411
 * Problem: Maximum Value of an Ordered Triplet II (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-07 15:34:02 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public long maximumTripletValue(int[] nums) {
        int len = nums.length;
        int[] prefMax = new int[len], suffMax = new int[len];
        int max = -1;
        for (int i = 0; i < len; i++){
            prefMax[i] = max;
            max = Math.max(max,nums[i]);
        }
        max = -1;
        for (int i = len - 1; i >= 0; i--){
            suffMax[i] = max;
            max = Math.max(max,nums[i]);
        }
        int ans = 0;
        for (int i = 1; i < len - 1; i++){
            ans = Math.max(ans,(prefMax[i] - nums[i])*suffMax[i]);
        } 
        return ans;
    }
}