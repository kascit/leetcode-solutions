/*
 * Submission: 1602565381
 * Problem: Move Zeroes (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-10 10:18:49 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero = 0; // Pointer to place the next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (i != nonzero && nums[i] != 0) {
                // Swap non-zero element with the element at `nonzero`
                int temp = nums[i];
                nums[i] = nums[nonzero];
                nums[nonzero] = temp;
                nonzero++; // Increment the nonzero pointer
            }
        }
    }
}