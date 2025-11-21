/*
 * Submission: 1739303385
 * Problem: Monotonic Array (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-18 06:39:53 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 2) return true;
        boolean increasing = nums[0] < nums[1];
        int prev = nums[0];
        for (int cur : nums){
            if (increasing){
                if (cur < prev) return false;
            } else {
                if (cur > prev) return false;
            }
            prev = cur;
        } return true;
    }
}