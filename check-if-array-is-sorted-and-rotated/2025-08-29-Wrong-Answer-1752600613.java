/*
 * Submission: 1752600613
 * Problem: Check if Array Is Sorted and Rotated (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-29 15:59:28 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean check(int[] nums) {

        int change = 0, len = nums.length;
        if (len <=3) return true;
        boolean incr = (nums[1] >= nums[0]);
        if (!incr) change++;
        for(int i = 1; i < len - 1; i++) {
            if (incr) {
                if (nums[i+1] < nums[i]) change++;
                incr = false;
            } else {
                if (nums[i+1] > nums[i]) change++;
                incr = true;
            }
            if (change == 2) return false;
        } return true;
    }
}