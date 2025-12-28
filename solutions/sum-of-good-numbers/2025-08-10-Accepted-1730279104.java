/*
 * Submission: 1730279104
 * Problem: Sum of Good Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:45:18 UTC
 * Runtime: 1 ms
 * Memory: 44.1 MB
 */

class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if ((i - k < 0 || nums[i] > nums[i - k]) && (i + k > len - 1 || nums[i] > nums[i + k])) {
                sum += nums[i];
            }
        }
        return sum;
    }
}