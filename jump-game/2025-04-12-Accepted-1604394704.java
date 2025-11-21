/*
 * Submission: 1604394704
 * Problem: Jump Game (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 10:01:19 UTC
 * Runtime: 3 ms
 * Memory: 45.9 MB
 */

class Solution {
    public boolean canJump(int[] nums) {
        int cur = 0, max = 0;
        while (cur < nums.length && cur <= max){
            max = Math.max(cur + nums[cur], max);
            cur++;
        }
        return cur >= nums.length ;
    }
}