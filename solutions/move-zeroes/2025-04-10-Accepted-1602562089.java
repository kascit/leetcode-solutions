/*
 * Submission: 1602562089
 * Problem: Move Zeroes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 10:14:17 UTC
 * Runtime: 2 ms
 * Memory: 46.1 MB
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}