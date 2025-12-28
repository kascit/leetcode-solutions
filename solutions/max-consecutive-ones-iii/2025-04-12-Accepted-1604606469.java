/*
 * Submission: 1604606469
 * Problem: Max Consecutive Ones III (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 14:40:53 UTC
 * Runtime: 4 ms
 * Memory: 46.4 MB
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int r = 0, max = k;
        for(int i = 0; i < nums.length; i++){
            
            if (i != 0 && nums[i-1] == 0) k++;

            while(r < nums.length && (nums[r] == 1 || k > 0) ){
                
                if (nums[r] == 0) k--;
                r++;
            }
            max = (r - i > max) ? r - i : max;
        }
        return max;
    }
}