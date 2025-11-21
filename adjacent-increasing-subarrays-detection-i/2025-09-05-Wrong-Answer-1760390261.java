/*
 * Submission: 1760390261
 * Problem: Adjacent Increasing Subarrays Detection I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-05 11:24:51 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        boolean first = false;
        int len = 1, prev = -1001;
        for (int i : nums) {
            if (i > prev) {
                len++;
            } else {
                first = false;
                len = 1;
            }
            if (len == k) {
                if (first) return true;
                first = true;
                prev = -1001;
                len = 1;
            }
            prev = i;
        } return false;
    }
}