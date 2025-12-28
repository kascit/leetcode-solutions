/*
 * Submission: 1602572091
 * Problem: Move Zeroes (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-10 10:27:57 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while(left < nums.length && nums[left] != 0) left++;
            if (left >= nums.length - 1) break;

            if (nums[right] != 0 && right != left) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}