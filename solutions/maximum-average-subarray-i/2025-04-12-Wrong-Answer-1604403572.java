/*
 * Submission: 1604403572
 * Problem: Maximum Average Subarray I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 10:12:56 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++){
            sum += nums[i];
        }
        for (int i = 1; i+k < nums.length; i++){
            sum = Math.max(sum, sum - nums[i-1] + nums[i+k-1]);
        }
        return (double)sum/k;
    }
}