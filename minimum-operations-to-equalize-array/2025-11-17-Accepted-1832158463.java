/*
 * Submission: 1832158463
 * Problem: Minimum Operations to Equalize Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 09:35:58 UTC
 * Runtime: 1 ms
 * Memory: 45 MB
 */

class Solution {
    public int minOperations(int[] nums) {
        int prev = -1;
        for (int n : nums) {
            if (prev != -1 && n != prev) return 1;
            prev = n;
    } return 0;
    }
}