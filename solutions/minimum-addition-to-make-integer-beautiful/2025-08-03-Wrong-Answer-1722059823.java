/*
 * Submission: 1722059823
 * Problem: Minimum Addition to Make Integer Beautiful (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-03 15:49:53 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        return 0;
    }
    long sumOfDigits(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}