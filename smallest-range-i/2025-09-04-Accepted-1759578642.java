/*
 * Submission: 1759578642
 * Problem: Smallest Range I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 16:31:37 UTC
 * Runtime: 3 ms
 * Memory: 45.7 MB
 */

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = -1, min = 10000, len = nums.length;
        for (int i = 0; i < len; i++) {
            int cur = nums[i];
            max = Math.max(max,cur);
            min = Math.min(min,cur);
        }
        return Math.max(0,max - min - (2*k));
    }
}