/*
 * Submission: 1705775349
 * Problem: Transform Array by Parity (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 10:03:50 UTC
 * Runtime: 1 ms
 * Memory: 45.5 MB
 */

class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if ((nums[i]&1) == 0) cnt++;
        }

        for(int i = cnt; i < nums.length; i++){
            ans[i] = 1;
        }

        return ans;
    }
}