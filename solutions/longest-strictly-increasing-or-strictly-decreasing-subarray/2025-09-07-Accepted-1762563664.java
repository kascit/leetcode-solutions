/*
 * Submission: 1762563664
 * Problem: Longest Strictly Increasing or Strictly Decreasing Subarray (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 10:59:46 UTC
 * Runtime: 1 ms
 * Memory: 43 MB
 */

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int prev = -1, incr = 0, decr = 0, ans = 0;
        for (int n : nums) {
            // ans = Math.max(ans,Math.max(incr,decr));
            if (prev == -1) {
                // System.out.println(n);
                incr++;
                decr++;
            } else if (n < prev) {
                // System.out.println(n);
                decr++;
                incr = 1;
            } else if (n > prev) {
                incr++;
                decr = 1;
            } else {
                incr = 1;
                decr = 1;
            }
            ans = Math.max(ans,Math.max(incr,decr));
            prev = n;
        } return ans;
    }
}