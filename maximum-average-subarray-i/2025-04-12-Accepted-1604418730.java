/*
 * Submission: 1604418730
 * Problem: Maximum Average Subarray I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 10:34:08 UTC
 * Runtime: 6 ms
 * Memory: 56.3 MB
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = Double.NEGATIVE_INFINITY, cursum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {                
                cursum = cursum - nums[i - k] + nums[i];
            } else {
                cursum += nums[i];
            }

            if (i >= k - 1) {
                sum = Math.max(sum, cursum);
            }
        }
        
        return sum / k;
    }
}
