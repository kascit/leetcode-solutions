/*
 * Submission: 1736007146
 * Problem: Find Greatest Common Divisor of Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 11:04:51 UTC
 * Runtime: 0 ms
 * Memory: 43.3 MB
 */

class Solution {
    public int findGCD(int[] nums) {
        int min = 1001, max = 0;
        for (int n : nums){
            min = (n < min) ? n : min;
            max = (n > max) ? n : max;
        }
        return gcd(min,max);
    }

    private int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b,a%b);
    }
}