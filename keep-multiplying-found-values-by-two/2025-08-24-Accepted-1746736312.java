/*
 * Submission: 1746736312
 * Problem: Keep Multiplying Found Values by Two (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 14:56:17 UTC
 * Runtime: 0 ms
 * Memory: 44.1 MB
 */

class Solution {
    public int findFinalValue(int[] nums, int original) {
        int x=original;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                return findFinalValue(nums,2*nums[i]);
            }
        }
        return x;
    }
}