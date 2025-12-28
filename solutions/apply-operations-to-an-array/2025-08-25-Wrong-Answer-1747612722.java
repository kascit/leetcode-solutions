/*
 * Submission: 1747612722
 * Problem: Apply Operations to an Array (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-25 10:33:58 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
            if (i > 0 && nums[i-1] == 0) {
                nums[i-1] = nums[i];
                nums[i] = 0;
            }
        } return nums;
    }
}