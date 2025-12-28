/*
 * Submission: 1604384817
 * Problem: Jump Game II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 09:46:53 UTC
 * Runtime: 1 ms
 * Memory: 45.1 MB
 */

class Solution {
    public int jump(int[] nums) {
        int cur = 0, count = 0, max = 0, end = 0;
        while(cur < nums.length - 1 && cur <= max){
            if (cur+nums[cur]>max){
                max = cur + nums[cur];
            }
            if (cur == end){
                end = max;
                count++;
            }
            cur++;
        }
        return count;
    }
}