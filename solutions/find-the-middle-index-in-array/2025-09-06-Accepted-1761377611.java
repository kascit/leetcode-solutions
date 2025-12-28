/*
 * Submission: 1761377611
 * Problem: Find the Middle Index in Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 10:50:16 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int findMiddleIndex(int[] nums) {
        int len = nums.length;
        // int[] pref = new int[len];
        int[] suf = new int[len];
        for (int i = len - 2; i >= 0; i--) {
            suf[i] = nums[i+1] + suf[i+1];
        }
        int carry = 0;
        for (int i = 0; i < len; i++) {
            suf[i] -= carry;
            if (suf[i] == 0) return i;
            carry += nums[i];
        }
        // System.out.println(Arrays.toString(suf));


        return -1;
    }
}