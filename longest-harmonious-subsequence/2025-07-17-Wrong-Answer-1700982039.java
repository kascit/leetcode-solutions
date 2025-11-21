/*
 * Submission: 1700982039
 * Problem: Longest Harmonious Subsequence (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-17 07:12:03 UTC
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
        return (nums[0] == nums[n-1] || max == 1) ? 0 : max;
    }
}