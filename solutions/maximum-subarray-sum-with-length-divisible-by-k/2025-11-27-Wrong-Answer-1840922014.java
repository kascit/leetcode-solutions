/*
Submission: 1840922014
Status: Wrong Answer
Timestamp: 2025-11-27 10:01:54 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long ans = Long.MIN_VALUE;
        int len = nums.length;
        int[] pref = new int[len+1];
        for (int i = 0; i < len; i++) {
            pref[i+1] = pref[i]+nums[i];
        }
        System.out.println(Arrays.toString(pref));


        long gloMAX = Long.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            long curSum = 0;
            long maxSum = pref[k];
            int start = i;
            for (int j = k-1; j < len; j+=k) {
                int blockSum = pref[j];
                if (j > k) blockSum -= pref[j-k];
                if (curSum + blockSum < blockSum) {
                    curSum = blockSum;
                } else {
                    curSum += blockSum; 
                }

                if (curSum > maxSum) {
                    maxSum = curSum;

                }
            }
            if (maxSum > gloMAX) {
                gloMAX = maxSum;
            }
        }
        return gloMAX;
    }
}