/*
 * Submission: 1698590187
 * Problem: Jump Game II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 09:17:14 UTC
 * Runtime: 1 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int jump(int[] nums) {
        int cur = 0, max = 0, curmax = 0, jumps = 0;
        while(cur < nums.length){
            max = Math.max(nums[cur] + cur,max);
            if (cur == curmax && cur != nums.length - 1) {
                jumps++;
                curmax = max;

            }
            cur++;
        }
        return jumps;
    }
}