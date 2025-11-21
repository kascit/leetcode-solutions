/*
 * Submission: 1750105443
 * Problem: Ant on the Boundary (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-27 11:53:21 UTC
 * Runtime: 0 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c = 0, acc = 0;
        for (int n : nums) {
            acc += n;
            if (acc == 0) c++;
        } return c;
    }
}