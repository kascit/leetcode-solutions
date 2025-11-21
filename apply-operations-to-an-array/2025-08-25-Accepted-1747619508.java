/*
 * Submission: 1747619508
 * Problem: Apply Operations to an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 10:41:43 UTC
 * Runtime: 3 ms
 * Memory: 43.9 MB
 */

class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length, zeroIdx = 0;
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
            zeroIdx = 0;
            while(zeroIdx < len && nums[zeroIdx] != 0) zeroIdx++;
            if (nums[i] != 0 && zeroIdx < len - 1 && i > zeroIdx) {
                nums[zeroIdx] = nums[i];
                nums[i] = 0;
            }
        } return nums;
    }
}