/*
 * Submission: 1604377566
 * Problem: Jump Game II (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 09:35:41 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int jump(int[] nums) {
        int cur = 0, count = 0, max = 0;
        while(cur < nums.length && cur <= max){
            if (cur != nums.length - 1 && cur+nums[cur]>max){
                max = cur + nums[cur];
                count++;
            }
            cur++;
        }
        return count;
    }
}