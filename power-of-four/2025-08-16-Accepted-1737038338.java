/*
 * Submission: 1737038338
 * Problem: Power of Four (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 08:43:00 UTC
 * Runtime: 0 ms
 * Memory: 40.6 MB
 */

class Solution {
    public boolean isPowerOfFour(int n) {
        return (n > 0 && (n&(n-1)) == 0) && ((n | 0b01010101010101010101010101010101) == 0b01010101010101010101010101010101);
    }
}