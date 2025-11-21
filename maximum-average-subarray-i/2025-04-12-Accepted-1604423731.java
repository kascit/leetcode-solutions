/*
 * Submission: 1604423731
 * Problem: Maximum Average Subarray I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 10:41:19 UTC
 * Runtime: 2 ms
 * Memory: 56.8 MB
 */

class Solution {
    public double findMaxAverage(int[] nums,final int k) {
        int sum = 0;

        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        
        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return (double) maxSum / k;
    }
}