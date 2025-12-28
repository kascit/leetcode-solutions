/*
 * Submission: 1761586161
 * Problem: Divide an Array Into Subarrays With Minimum Cost I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:59:37 UTC
 * Runtime: 1 ms
 * Memory: 44 MB
 */

class Solution {
    public int minimumCost(int[] nums) {
        int len = nums.length;
        int s = 50, t = 50;
        for (int i = 1; i < len; i++) {
            int cur = nums[i];
            if (cur <= s) {
                t = s;
                s = cur;
            } else if (cur < t) {
                t = cur;
            }
        }
        return nums[0] + s + t;
    }
}