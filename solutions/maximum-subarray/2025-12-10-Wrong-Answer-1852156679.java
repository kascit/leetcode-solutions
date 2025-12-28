/*
Submission: 1852156679
Status: Wrong Answer
Timestamp: 2025-12-10 16:00:01 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0, cur = 0;
        for (int n : nums) {
          cur = Math.max(cur+n,n);
          max = Math.max(cur,max);
        } return max;
    }
}