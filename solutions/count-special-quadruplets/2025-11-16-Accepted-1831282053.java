/*
 * Submission: 1831282053
 * Problem: Count Special Quadruplets (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 11:46:42 UTC
 * Runtime: 12 ms
 * Memory: 43.5 MB
 */

class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                for(int k=j+1;k<nums.length-1;k++){
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