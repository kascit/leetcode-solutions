/*
 * Submission: 1601881573
 * Problem: Increasing Triplet Subsequence (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-09 16:51:26 UTC
 * Runtime: 2 ms
 * Memory: 133.8 MB
 */

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
}