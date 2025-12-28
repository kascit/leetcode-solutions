/*
 * Submission: 1759579496
 * Problem: Smallest Range I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 16:32:18 UTC
 * Runtime: 3 ms
 * Memory: 45.8 MB
 */

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0], min = nums[0], len = nums.length;
        for (int i = 1; i < len; i++) {
            int cur = nums[i];
            max = Math.max(max,cur);
            min = Math.min(min,cur);
        }
        return Math.max(0,max - min - (2*k));
    }
}