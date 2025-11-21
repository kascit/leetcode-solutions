/*
 * Submission: 1760809928
 * Problem: Find the Array Concatenation Value (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 18:48:46 UTC
 * Runtime: 1 ms
 * Memory: 43.1 MB
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
            while(check <= re) check *= 10;
            // System.out.print(le+"  + ");
            // System.out.println(re);
            // System.out.println(le*check+re);
            ans += le*check + re;
            l++;
            r--;
        }
        if (odd) ans += nums[l];
        return ans;
    }
}