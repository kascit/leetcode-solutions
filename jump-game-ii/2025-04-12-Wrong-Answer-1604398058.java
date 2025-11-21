/*
 * Submission: 1604398058
 * Problem: Jump Game II (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 10:05:43 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int jump(int[] nums) {
        int cur = 0, max = 0, curmax = 0, jump = -1;
        while (cur < nums.length && cur <= max){
            max = Math.max(max, cur + nums[cur]);
            if (cur == curmax){
                curmax = max;
                jump++;
            }
            cur++;
        }
        return jump;
    }
}