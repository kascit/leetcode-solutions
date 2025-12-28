/*
 * Submission: 1836003007
 * Problem: Maximum XOR After Operations  (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 13:09:28 UTC
 * Runtime: 1 ms
 * Memory: 59.1 MB
 */

class Solution {
    public int maximumXOR(int[] nums) {
        int ans = 0;for (int n : nums) {
            ans |= n;
        } return ans;
    }
}