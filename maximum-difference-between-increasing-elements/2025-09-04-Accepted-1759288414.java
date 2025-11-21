/*
 * Submission: 1759288414
 * Problem: Maximum Difference Between Increasing Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 11:21:45 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int maximumDifference(int[] nums) {
        int min = (int) 1e9, ans = -1;
        for (int n : nums) {
            ans = Math.max(ans,n-min);
            min = Math.min(min,n);
        }
        return (ans > 0) ? ans : -1; 
    }
}