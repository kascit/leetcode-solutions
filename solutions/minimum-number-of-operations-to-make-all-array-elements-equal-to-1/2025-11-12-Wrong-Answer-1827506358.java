/*
 * Submission: 1827506358
 * Problem: Minimum Number of Operations to Make All Array Elements Equal to 1 (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-12 04:51:52 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, min = Integer.MAX_VALUE;
        boolean ans = false, allOne = true;
        for (int i = 0; i < n - 1; i++) {
            if(nums[i] != 1) allOne = false;
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
        if (allOne) return 0;
        if (ans) return min;
        return -1;
    }

    int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}