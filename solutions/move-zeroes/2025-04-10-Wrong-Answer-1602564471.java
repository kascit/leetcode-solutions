/*
 * Submission: 1602564471
 * Problem: Move Zeroes (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-10 10:17:32 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0 && right != left) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}