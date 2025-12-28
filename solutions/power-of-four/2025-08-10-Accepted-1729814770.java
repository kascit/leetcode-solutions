/*
 * Submission: 1729814770
 * Problem: Power of Four (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 07:04:23 UTC
 * Runtime: 0 ms
 * Memory: 40.3 MB
 */

class Solution {
    public boolean isPowerOfFour(int n) {
        return (n > 0 && (n&(n-1)) == 0) && ((n | 0b01010101010101010101010101010101) == 0b01010101010101010101010101010101);
    }
}