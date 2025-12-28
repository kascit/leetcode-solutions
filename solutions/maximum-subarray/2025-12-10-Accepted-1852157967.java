/*
Submission: 1852157967
Status: Accepted
Timestamp: 2025-12-10 16:01:33 UTC
Runtime: 1 ms
Memory: 77 MB
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], cur = 0;
        for (int n : nums) {
          cur = Math.max(cur+n,n);
          max = Math.max(cur,max);
        } return max;
    }
}