/*
 * Submission: 1604394868
 * Problem: Jump Game (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 10:01:34 UTC
 * Runtime: 2 ms
 * Memory: 45.7 MB
 */

class Solution {
    public boolean canJump(int[] nums) {
        int cur = 0, max = 0;
        while (cur <= max) {
            max = Math.max(max, cur + nums[cur]);
            if (max >= nums.length - 1) return true;
            cur++;
        }
        return false;
    }
}
