/*
 * Submission: 1750100156
 * Problem: Find the Sum of Encrypted Integers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-27 11:47:06 UTC
 * Runtime: 1 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += e(n);
        } return sum;
    }

    private int e (int n) {
        int t = 1, m = 0;
        while (n > 0) {
            m = Math.max(m,n%10);
            n/=10;
            t*=10;
        } t/=10;
        int ans = 0;
        while (t > 0) {
            ans += m*t;
            t/=10;
        } return ans;
    }
}