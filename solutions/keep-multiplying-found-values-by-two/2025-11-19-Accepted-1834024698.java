/*
 * Submission: 1834024698
 * Problem: Keep Multiplying Found Values by Two (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 08:12:20 UTC
 * Runtime: 0 ms
 * Memory: 45.7 MB
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