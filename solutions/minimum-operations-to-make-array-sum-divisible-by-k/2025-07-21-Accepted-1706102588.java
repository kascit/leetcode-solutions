/*
 * Submission: 1706102588
 * Problem: Minimum Operations to Make Array Sum Divisible by K (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 15:18:57 UTC
 * Runtime: 4 ms
 * Memory: 45 MB
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        return (Arrays.stream(nums).sum() % k);
    }
}