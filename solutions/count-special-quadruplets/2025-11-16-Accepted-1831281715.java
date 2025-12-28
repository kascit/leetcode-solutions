/*
 * Submission: 1831281715
 * Problem: Count Special Quadruplets (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 11:46:09 UTC
 * Runtime: 12 ms
 * Memory: 43.2 MB
 */

class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    for(int l=k+1;l<nums.length;l++){
                        if(nums[i]+nums[j]+nums[k] == nums[l]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}