/*
 * Submission: 1604418887
 * Problem: Maximum Average Subarray I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 10:34:21 UTC
 * Runtime: 5 ms
 * Memory: 57.1 MB
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cursum = 0;

        // Build the first window
        for (int i = 0; i < k; i++) {
            cursum += nums[i];
        }

        double maxSum = cursum;

        // Slide the window through the rest of the array
        for (int i = k; i < nums.length; i++) {
            cursum = cursum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, cursum);
        }

        return maxSum / k;
    }
}
