/*
 * Submission: 1772863804
 * Problem: Check if Array is Good (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-16 15:07:49 UTC
 * Runtime: 3 ms
 * Memory: 42.7 MB
 */

class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i+1]) {
                if (i != len - 2) return false;
                return nums[i] + 1 == len;
            }
        }
        return false;
    }
}