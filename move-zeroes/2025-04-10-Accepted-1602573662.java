/*
 * Submission: 1602573662
 * Problem: Move Zeroes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 10:30:05 UTC
 * Runtime: 2 ms
 * Memory: 46.2 MB
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Move `left` forward only if it's pointing to a zero
                if (left != right) {
                    nums[left] = nums[right];
                    nums[right] = 0;
                }
                left++;
            }
        }
    }
}
