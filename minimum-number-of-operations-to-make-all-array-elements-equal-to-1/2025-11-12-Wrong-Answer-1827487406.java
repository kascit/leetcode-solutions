/*
 * Submission: 1827487406
 * Problem: Minimum Number of Operations to Make All Array Elements Equal to 1 (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-12 04:23:09 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (gcd(nums[i],nums[i+1]) == 1) return n;
        }
        return -1;
    }

    int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}