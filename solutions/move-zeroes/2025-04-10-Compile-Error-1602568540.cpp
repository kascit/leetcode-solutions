/*
 * Submission: 1602568540
 * Problem: Move Zeroes (Easy)
 * Status: Compile Error
 * Language: cpp
 * Timestamp: 2025-04-10 10:23:04 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0 right != left) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}