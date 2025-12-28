/*
 * Submission: 1746524849
 * Problem: Maximum Difference Between Adjacent Elements in a Circular Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:13:48 UTC
 * Runtime: 0 ms
 * Memory: 43.3 MB
 */

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length, max = 0;
        for (int i = 0; i < len - 1; i++) {
            max = Math.max(max,Math.abs(nums[i]-nums[i+1]));
        }
        max = Math.max(max,Math.abs(nums[0]-nums[len-1]));
        return max;
    }
}