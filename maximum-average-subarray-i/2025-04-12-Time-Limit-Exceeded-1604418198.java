/*
 * Submission: 1604418198
 * Problem: Maximum Average Subarray I (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-04-12 10:33:23 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = Double.NEGATIVE_INFINITY, cursum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                System.out.print(cursum + " ");
                System.out.print(nums[i - k] + " ");
                System.out.print(nums[i] + " ");
                System.out.println();
                
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
