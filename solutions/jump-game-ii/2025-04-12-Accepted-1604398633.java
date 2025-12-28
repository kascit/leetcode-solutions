/*
 * Submission: 1604398633
 * Problem: Jump Game II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 10:06:25 UTC
 * Runtime: 1 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int jump(int[] nums) {
        int cur = 0, max = 0, curmax = 0, jump = 0;
        while (cur < nums.length - 1 && cur <= max){
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