/*
 * Submission: 1757791581
 * Problem: Reducing Dishes (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 04:43:02 UTC
 * Runtime: 2 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int len = satisfaction.length, ans = 0, cur = 0, carry = 0;
        Arrays.sort(satisfaction);
        for (int i = len - 1; i >= 0; i--) {
            carry += satisfaction[i];
            cur += carry;
            ans = Math.max(cur,ans);
        }
        // System.out.println(Arrays.toString(satisfaction));
        return ans;
    }
}