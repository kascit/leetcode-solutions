/*
 * Submission: 1762389685
 * Problem: Sign of the Product of an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:29:18 UTC
 * Runtime: 0 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int arraySign(int[] nums) {
        int ans = 1;
        for (int n : nums) {
            if (n < 0) ans *= -1;
            if (n == 0) return 0;
        } return ans;
    }
}