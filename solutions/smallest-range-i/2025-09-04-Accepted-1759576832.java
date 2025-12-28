/*
 * Submission: 1759576832
 * Problem: Smallest Range I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 16:30:03 UTC
 * Runtime: 3 ms
 * Memory: 46.1 MB
 */

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = -1, min = 10000;
        for (int n : nums) {
            max = Math.max(max,n);
            min = Math.min(min,n);
        }
        return Math.max(0,max - min - (2*k));
    }
}