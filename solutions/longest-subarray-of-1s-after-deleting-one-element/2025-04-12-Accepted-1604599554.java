/*
 * Submission: 1604599554
 * Problem: Longest Subarray of 1's After Deleting One Element (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 14:37:25 UTC
 * Runtime: 4 ms
 * Memory: 56.6 MB
 */

class Solution {
    public int longestSubarray(int[] nums) {
        int r = 0, max = 0;
        boolean zero = false;
        for (int l = 0; l < nums.length; l++){

            if (l != 0 && nums[l-1] == 0) zero = false;

            while(r < nums.length && (nums[r] == 1 || !zero)){
                if ( nums[r] == 0 ){zero = true;}
                r++;
            }

            max = Math.max(max, r - l);
            
        }
        return max - 1;
    }
}