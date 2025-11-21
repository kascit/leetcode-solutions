/*
 * Submission: 1700979849
 * Problem: Longest Harmonious Subsequence (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-07-17 07:09:52 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = 0, max = 0, cur = 0, n = nums.length;
        while(r<n){
            while(nums[r] - nums[l] > 1) l++;
            cur = r - l + 1;
            max = Math.max(max,cur);
            r++;
            //System.out.println("left: " + l + " Right: " + r + " Cur: " + cur);
        }
        return (nums[0] == nums[n]) ? 0 : max;
    }
}