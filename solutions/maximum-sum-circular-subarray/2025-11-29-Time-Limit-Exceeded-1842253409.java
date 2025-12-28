/*
Submission: 1842253409
Status: Time Limit Exceeded
Timestamp: 2025-11-29 06:27:33 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length;
        int gmax = nums[0];
        int c = 0;
        for (int i = 0; i < len; i++) {
            int cur = Integer.MIN_VALUE/2;
            int max = Integer.MIN_VALUE/2;
            boolean first = true;
            for (int j = i; first || j != i; j++) {
                first = false;
                cur = Math.max(nums[j],cur+nums[j]);
                max = Math.max(cur,max);
                // System.out.println(i+"   "+j +" "+cur);
                if (j == len - 1) j = -1;
            }
            gmax = Math.max(gmax,max);
        } return gmax;
    }
}