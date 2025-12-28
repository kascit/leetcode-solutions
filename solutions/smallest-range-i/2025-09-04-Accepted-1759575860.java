/*
 * Submission: 1759575860
 * Problem: Smallest Range I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 16:29:12 UTC
 * Runtime: 4 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = -1, min = 10000;
        for (int n : nums) {
            max = Math.max(max,n);
            min = Math.min(min,n);
        }
        int f = max - min - (2*k);
        return (f > 0 ) ? f : 0;
    }
}