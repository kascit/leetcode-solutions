/*
 * Submission: 1759287640
 * Problem: Maximum Difference Between Increasing Elements (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-04 11:20:47 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maximumDifference(int[] nums) {
        int min = 1000, ans = -1;
        for (int n : nums) {
            ans = Math.max(ans,n-min);
            min = Math.min(min,n);
        }
        return (ans > 0) ? ans : -1; 
    }
}