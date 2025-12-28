/*
 * Submission: 1830551510
 * Problem: Compute Alternating Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-15 17:21:12 UTC
 * Runtime: 1 ms
 * Memory: 46.7 MB
 */

class Solution {
    public int alternatingSum(int[] nums) {
        int ans = 0, l = nums.length;
        for (int i = 0; i < l; i++){
            int cur = nums[i];
            if ((i&1) == 0) ans += cur;
            else ans -= cur;
        } return ans;
    }
}