/*
 * Submission: 1605685590
 * Problem: Find Pivot Index (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 14:28:34 UTC
 * Runtime: 1 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return 0;

        int total_sum = 0, left = 0;
        for (int num : nums) {
            total_sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (left == total_sum - left - nums[i]) {
                return i;
            }
            left += nums[i];
        }

        return -1;
    }
}