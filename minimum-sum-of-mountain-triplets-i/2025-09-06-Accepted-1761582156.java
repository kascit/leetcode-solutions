/*
 * Submission: 1761582156
 * Problem: Minimum Sum of Mountain Triplets I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:55:08 UTC
 * Runtime: 1 ms
 * Memory: 42.3 MB
 */

class Solution {
    public int minimumSum(int[] nums) {
        int len = nums.length;
        int[] smallerP = new int[len];
        int[] smallerN = new int[len];
        int peek = -1;
        for (int i = 0; i < len; i++) {
            int cur = nums[i];
            smallerP[i] = (peek < cur) ? peek : -1;
            if (peek == -1 || peek > cur) peek = cur;
        }
        // System.out.println(Arrays.toString(smallerP));

        peek = -1;
        for (int i = len - 1; i >= 0; i--) {
            int cur = nums[i];
            smallerN[i] = (peek < cur) ? peek : -1;
            if (peek == -1 || peek > cur) peek = cur;
        }
        // System.out.println(Arrays.toString(smallerN));
        int ans = 151;
        for (int i = 0; i < len; i++) {
            if (smallerP[i] == -1) continue;
            if (smallerN[i] == -1) continue;
            ans = Math.min(ans,nums[i]+smallerP[i]+smallerN[i]);
        }
        if (ans == 151) return -1;
        return ans;
    }
}