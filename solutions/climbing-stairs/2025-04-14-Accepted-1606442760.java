/*
 * Submission: 1606442760
 * Problem: Climbing Stairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 09:42:40 UTC
 * Runtime: 0 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
}