/*
 * Submission: 1737038101
 * Problem: Power of Four (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 08:42:43 UTC
 * Runtime: 0 ms
 * Memory: 40.8 MB
 */

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        return (n%4 == 0) && isPowerOfFour(n/4);
    }
}