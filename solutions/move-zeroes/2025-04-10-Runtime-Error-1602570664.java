/*
 * Submission: 1602570664
 * Problem: Move Zeroes (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-04-10 10:26:06 UTC
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
            } else while(left < nums.length && nums[left] != 0) left++;
            if (left == nums.length - 1) break;
        }        
    }
}