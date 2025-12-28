/*
 * Submission: 1762418443
 * Problem: Check Divisibility by Digit Sum and Product (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 08:03:28 UTC
 * Runtime: 0 ms
 * Memory: 41 MB
 */

class Solution {
    public boolean checkDivisibility(int n) {
        int t = n, sum = 0, prod = 1;
        while (t > 0) {
            int cur = t%10;
            sum += cur;
            prod *= cur;
            t /= 10;
        } return (n % (sum + prod)) == 0;
    }
}