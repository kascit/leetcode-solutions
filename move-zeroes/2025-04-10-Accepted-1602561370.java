/*
 * Submission: 1602561370
 * Problem: Move Zeroes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 10:13:16 UTC
 * Runtime: 2 ms
 * Memory: 46.1 MB
 */

class Solution {
     public void moveZeroes(int[] nums) {
        int snowBallSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                snowBallSize++; 
            }
            else if (snowBallSize > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-snowBallSize]=t;
            }
        }
    }
}