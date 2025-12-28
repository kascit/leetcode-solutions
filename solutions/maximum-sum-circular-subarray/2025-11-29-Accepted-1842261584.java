/*
Submission: 1842261584
Status: Accepted
Timestamp: 2025-11-29 06:40:19 UTC
Runtime: 7 ms
Memory: 51.1 MB
*/

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length;
        int gmax = nums[0];

        int cur = Integer.MIN_VALUE/2;
        int max = Integer.MIN_VALUE/2;

        int curm = Integer.MAX_VALUE/2;
        int min = Integer.MAX_VALUE/2;
        
        int sum = 0;
        boolean allNeg = true;
        for (int n : nums) {
            sum += n;
            if (n >= 0) allNeg = false;
        }

        for (int i = 0; i < len; i++) {
            cur = Math.max(nums[i],cur+nums[i]);
            max = Math.max(cur,max);

            curm = Math.min(nums[i],curm+nums[i]);
            min = Math.min(curm,min);
            // System.out.println(max+"  "+min);
            // System.out.println(sum-min);
            // System.out.println();
            gmax = Math.max(gmax,max);
            if (!allNeg) gmax = Math.max(gmax,sum-min);

        } return gmax;
    }
}