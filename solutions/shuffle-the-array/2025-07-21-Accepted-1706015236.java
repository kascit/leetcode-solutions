/*
 * Submission: 1706015236
 * Problem: Shuffle the Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 14:04:21 UTC
 * Runtime: 0 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i]     = nums[i];      // xᵢ
            result[2 * i + 1] = nums[i + n];  // yᵢ
        }
        return result;
    }
}