/*
 * Submission: 1701061223
 * Problem: Longest Harmonious Subsequence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 08:42:46 UTC
 * Runtime: 13 ms
 * Memory: 46.1 MB
 */

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = 0, max = 0, cur = 0, n = nums.length;
        while(r<n){
            
            while(l < n && nums[r] - nums[l] > 1) l++;
            if(l < n && nums[r] - nums[l] == 1) cur = r - l + 1;
            max = Math.max(max,cur);
            r++;
            //System.out.println("left: " + l + " Right: " + r + " Cur: " + cur);
        }
        return (nums[0] == nums[n-1] || max == 1) ? 0 : max;
    }
}