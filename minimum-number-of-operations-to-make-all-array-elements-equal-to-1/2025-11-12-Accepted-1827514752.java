/*
 * Submission: 1827514752
 * Problem: Minimum Number of Operations to Make All Array Elements Equal to 1 (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-12 05:03:53 UTC
 * Runtime: 1 ms
 * Memory: 43.7 MB
 */

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, min = Integer.MAX_VALUE, ones = 0;
        // boolean ans = false;
        if(nums[n-1] == 1) ones++;
        for (int i = 0; i < n - 1; i++) {
            if(nums[i] == 1) ones++;
            int cur = nums[i];
            int  cnt = 0;
            for(int j = i + 1; j < n; j++) {
                cur = gcd(cur,nums[j]);
                if (cur == 1) {
                    min = Math.min(n + cnt,min);
                    break;
                    // if (min == n) return n - ones;
                    // ans = true;
                }
                cnt++;
            }
        }
        // System.out.println(allOne);
        // if (allOne) return 0;
        if (min < Integer.MAX_VALUE) return min - ones;
        return -1;
    }

    int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}