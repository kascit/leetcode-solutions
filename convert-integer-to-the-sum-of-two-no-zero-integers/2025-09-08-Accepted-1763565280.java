/*
 * Submission: 1763565280
 * Problem: Convert Integer to the Sum of Two No-Zero Integers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-08 08:54:34 UTC
 * Runtime: 0 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isValid(a) && isValid(b)) {
                return new int[]{a, b};
            }
        }
        return new int[0];
    }

    private boolean isValid(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false;
            num /= 10;
        }
        return true;
    }
}