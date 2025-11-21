/*
 * Submission: 1753076951
 * Problem: Min Max Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 04:48:23 UTC
 * Runtime: 1 ms
 * Memory: 43 MB
 */

class Solution {
    public int minMaxGame(int[] nums) {
        int len = nums.length;
        while(len>0){
            int idx = 0;
            for (int i = 0; i < len - 1; i+=2) {
                if((idx&1) == 0) {
                    nums[idx] = Math.min(nums[i],nums[i+1]);
                } else {
                    nums[idx] = Math.max(nums[i],nums[i+1]);
                }
                idx++;
            }
            len/=2;
        } return nums[0];
    }
}