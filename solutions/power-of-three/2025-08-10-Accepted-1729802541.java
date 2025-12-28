/*
 * Submission: 1729802541
 * Problem: Power of Three (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 06:51:48 UTC
 * Runtime: 8 ms
 * Memory: 44.2 MB
 */

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        if (n == 1) return true;
        return n%3 == 0 && isPowerOfThree(n/3);
    }
}