/*
Submission: 1841036211
Status: Wrong Answer
Timestamp: 2025-11-27 13:30:24 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long ans = Long.MIN_VALUE;
        int len = nums.length;
        long[] pref = new long[len+1];
        for (int i = 0; i < len; i++) {
            pref[i+1] = pref[i]+nums[i];
        }
        // System.out.println(Arrays.toString(pref));


        long gloMAX = Long.MIN_VALUE;
        for (int i = k; i < Math.min(2*k,len+1); i++) {
            // long curSum = Long.MIN_VALUE/2;
            long maxSum = Long.MIN_VALUE/2;
            int start = 0;
            // System.out.println("chain num: " + i);
            for (int j = i; j <= len; j+=k) {
                long curSum = pref[j] - pref[start];
                // if (j > k) blockSum -= pref[j-k];
                long blockSum = pref[j];
                if (j >= k) blockSum -= pref[j-k];
                // System.out.println("j: " + j);
                // System.out.println("bS: " + blockSum);
                // System.out.println();
                if (i == 0 && j == 0 && blockSum == 0) continue;
                if (curSum < blockSum) {
                    start = j - k;
                    curSum = blockSum;
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
