/*
 * Submission: 1735117022
 * Problem: Maximum Sum With Exactly K Elements  (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 16:02:13 UTC
 * Runtime: 5 ms
 * Memory: 45.4 MB
 */

class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().orElseThrow();
        return max*k + k*(k-1)/2;
    }
}