/*
 * Submission: 1739307625
 * Problem: Monotonic Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 06:44:25 UTC
 * Runtime: 2 ms
 * Memory: 59.4 MB
 */

class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 2) return true;
        int prev = nums[0];
        boolean increasing = true, first = true;
        for (int cur : nums){
            if (cur == prev) continue;
            else if (first) {
                if (cur > prev){
                    increasing = true;
                } else {
                    increasing = false;
                }
                first = false;
            }
            if (increasing && cur < prev) return false;
            if (!increasing && cur > prev) return false;
            prev = cur;
        } return true;
    }
}