/*
 * Submission: 1762395497
 * Problem: Minimum Value to Get Positive Step by Step Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:35:54 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
 */

class Solution {
    public int minStartValue(int[] nums) {
        int ans = 1, val = 1;
        for (int n : nums) {
            if (val + n <= 0) {
                int t = -1*n;
                ans += (t-val)+1;
                val += (t-val)+1;
            } val += n;
        } return ans;
    }
}