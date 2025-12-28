/*
 * Submission: 1706064524
 * Problem: Left and Right Sum Differences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 14:46:28 UTC
 * Runtime: 2 ms
 * Memory: 45 MB
 */

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length, cur = 0;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = cur;
            cur += nums[i];
        }

        cur = 0;
        for (int i = n - 1; i >= 0; i--){
            ans[i] = Math.abs(ans[i] - cur);
            cur += nums[i];
        }

        return ans;
    }
}