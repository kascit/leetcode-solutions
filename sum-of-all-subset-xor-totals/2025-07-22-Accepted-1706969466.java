/*
 * Submission: 1706969466
 * Problem: Sum of All Subset XOR Totals (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-22 08:31:14 UTC
 * Runtime: 0 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int subsetXORSum(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result |= num;
        }
        return result << (nums.length - 1);
    }
}