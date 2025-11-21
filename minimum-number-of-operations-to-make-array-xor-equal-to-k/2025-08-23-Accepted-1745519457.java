/*
 * Submission: 1745519457
 * Problem: Minimum Number of Operations to Make Array XOR Equal to K (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:08:29 UTC
 * Runtime: 1 ms
 * Memory: 61.5 MB
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        for (int n : nums) {
            k ^= n;
        }
        return Integer.bitCount(k);
    }
}

