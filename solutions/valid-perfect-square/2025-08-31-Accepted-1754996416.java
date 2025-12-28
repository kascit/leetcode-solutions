/*
 * Submission: 1754996416
 * Problem: Valid Perfect Square (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 16:53:40 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        return (int) sqrt == sqrt;
    }
}