/*
 * Submission: 1763551085
 * Problem: Convert Integer to the Sum of Two No-Zero Integers (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-08 08:38:14 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] getNoZeroIntegers(int n) {
        return ((n&1) == 0) ? new int[] {1,n-1} : new int[] {2,n-2};
    }
}