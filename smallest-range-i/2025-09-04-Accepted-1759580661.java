/*
 * Submission: 1759580661
 * Problem: Smallest Range I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 16:33:17 UTC
 * Runtime: 2 ms
 * Memory: 45.9 MB
 */

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0], min = nums[0], len = nums.length;
        for (int i = 1; i < len; i++) {
            int cur = nums[i];
            max = (max > cur) ? max : cur;
            min = (min < cur) ? min : cur;
        }
        return Math.max(0,max - min - (2*k));
    }
}