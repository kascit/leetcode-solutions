/*
 * Submission: 1701064326
 * Problem: Longest Harmonious Subsequence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 08:46:18 UTC
 * Runtime: 12 ms
 * Memory: 46 MB
 */

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = 0, max = 0, n = nums.length;
        while(r<n){
            
            while(nums[r] - nums[l] > 1) l++;
            if(nums[r] - nums[l] == 1) max = Math.max(max, r - l + 1);
            r++;
            //System.out.println("left: " + l + " Right: " + r + " Cur: " + cur);
        }
        return max;
    }
}