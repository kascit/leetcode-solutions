/*
Submission: 1841046083
Status: Accepted
Timestamp: 2025-11-27 13:45:09 UTC
Runtime: 5 ms
Memory: 145.7 MB
*/

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int len = nums.length;
        long[] pref = new long[len+1];
        for (int i = 0; i < len; i++) {
            pref[i+1] = pref[i]+nums[i];
        }
        // System.out.println(Arrays.toString(pref));

        // int brbr = Math.min(2*k,len+1);
        long gloMAX = Long.MIN_VALUE;
        for (int i = 0; i < k && i < len; i++) {
            // long curSum = Long.MIN_VALUE/2;
            long maxSum = Long.MIN_VALUE/2;
            long curSum = Long.MIN_VALUE/2;
            // System.out.println("chain num: " + i);
            for (int j = i + k; j <= len; j+=k) {
                // if (j > k) blockSum -= pref[j-k];
                long blockSum = pref[j] - pref[j-k];
                // System.out.println("j: " + j);
                // System.out.println("bS: " + blockSum);
                // System.out.println();
                // if (i == 0 && j == 0 && blockSum == 0) continue;
                if (curSum == Long.MIN_VALUE/2) curSum = blockSum;
                else curSum = Math.max(blockSum, curSum + blockSum);
                if (curSum > maxSum) maxSum = curSum;
            }
            if (maxSum > gloMAX) gloMAX = maxSum;
        }
        return gloMAX;
    }
}
