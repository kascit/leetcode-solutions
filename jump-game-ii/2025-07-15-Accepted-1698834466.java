/*
 * Submission: 1698834466
 * Problem: Jump Game II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 13:29:39 UTC
 * Runtime: 3 ms
 * Memory: 42.8 MB
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
        System.gc();
        return jumps;
    }
}