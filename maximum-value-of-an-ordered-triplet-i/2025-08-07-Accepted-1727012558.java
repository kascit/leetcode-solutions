/*
 * Submission: 1727012558
 * Problem: Maximum Value of an Ordered Triplet I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-07 15:37:05 UTC
 * Runtime: 0 ms
 * Memory: 42.4 MB
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
        long ans = 0;
        for (int i = 1; i < len - 1; i++){
            ans = Math.max(ans,(long)(prefMax[i] - nums[i])*suffMax[i]);
        } 
        return ans;
    }
}