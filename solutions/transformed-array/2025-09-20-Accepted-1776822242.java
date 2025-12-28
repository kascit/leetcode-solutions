/*
 * Submission: 1776822242
 * Problem: Transformed Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-20 08:33:33 UTC
 * Runtime: 1 ms
 * Memory: 45 MB
 */

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            int cur = nums[i];
            int put = -1;
            if (cur == 0) {
                put = i;
            } else if (cur < 0) {
                cur = cur*-1;
                cur%=len;
                put = (len+i-cur)%len;
            } else put = (i+cur)%len;
            ans[i] = nums[put];
        } return ans;
    }
}