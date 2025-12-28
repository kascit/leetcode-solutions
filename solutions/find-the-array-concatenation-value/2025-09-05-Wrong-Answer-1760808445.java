/*
 * Submission: 1760808445
 * Problem: Find the Array Concatenation Value (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-05 18:47:05 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int l = 0, r = nums.length - 1;
        boolean odd = (nums.length&1) == 1;
        while (l < r) {
            int check = 1;
            int le = nums[l];
            int re = nums[r];
            while(check < re) check *= 10;
            ans += le*check + re;
            l++;
            r--;
        }
        if (odd) ans += nums[l];
        return ans;
    }
}