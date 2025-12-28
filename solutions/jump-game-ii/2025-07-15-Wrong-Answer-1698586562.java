/*
 * Submission: 1698586562
 * Problem: Jump Game II (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-15 09:13:46 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int jump(int[] nums) {
        int cur = 0, max = 0, curmax = 0, jumps = 0;
        while(cur < nums.length){
            curmax = Math.max(nums[cur] + cur,curmax);
            if (cur == max) {
                jumps++;
                max = curmax;

            }
            cur++;
        }
        return Math.max(jumps-1,1);
    }
}