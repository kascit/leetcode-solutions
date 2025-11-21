/*
 * Submission: 1604410625
 * Problem: Maximum Average Subarray I (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-04-12 10:22:28 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, cursum = 0;
        for (int i = 0; i < k; i++){
            cursum += nums[i];
        }
        sum = cursum;
        for (int i = 1; i+k-1 < nums.length; i++){
            System.out.print(sum +" ");
            System.out.print(nums[i-1] +" ");
            System.out.print(nums[i+k-1] +" ");
            System.out.println();
            cursum = cursum - nums[i-1] + nums[i+k-1];
            sum = Math.max(sum, cursum);
        }
        return (double)sum/k;
    }
}