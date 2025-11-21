/*
 * Submission: 1747620458
 * Problem: Apply Operations to an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 10:42:53 UTC
 * Runtime: 1 ms
 * Memory: 43.6 MB
 */

class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
               nums[i]=nums[i]*2;
               nums[i+1]=0;
            }
        }
        int nz=0;
        int z=0;
        while(nz<n){
          if(nums[nz]!=0){
            int temp=nums[nz];
            nums[nz]=nums[z];
            nums[z]=temp;
            nz++;
            z++;
          }
          else{
            nz++;
          }
        }
        return nums;
    }
}