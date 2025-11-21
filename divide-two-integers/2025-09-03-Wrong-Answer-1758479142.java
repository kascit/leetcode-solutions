/*
 * Submission: 1758479142
 * Problem: Divide Two Integers (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-03 17:13:38 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1) return 2147483647;
        int i = 1;
        if (dividend < 0) {
            dividend *= -1;
            i *= -1;
        }
        if (divisor < 0) {
            divisor *= -1;
            i *= -1;
        }
        int ans = 0;
        while (dividend >= divisor) {
            ans++;
            dividend-=divisor;
        }
        return ans*i;
    }
}