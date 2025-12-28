/*
 * Submission: 1827505600
 * Problem: Minimum Number of Operations to Make All Array Elements Equal to 1 (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-12 04:50:44 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, min = Integer.MAX_VALUE;
        boolean ans = false;
        for (int i = 0; i < n - 1; i++) {
            int cur = nums[i];
            int  cnt = 0;
            for(int j = i + 1; j < n; j++) {
                cur = gcd(cur,nums[j]);
                if (cur == 1) {
                    min = Math.min(n + cnt,min);
                    ans = true;
                }
                cnt++;
            }
        }
        if (ans) return min;
        return -1;
    }

    int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}