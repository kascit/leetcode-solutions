/*
 * Submission: 1604414771
 * Problem: Maximum Average Subarray I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 10:28:24 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, cursum = 0;
        for (int i = 0; i < nums.length; i++){
            
            
            if (i >= k) {
                System.out.print(cursum +" ");
                System.out.print(nums[i-k] +" ");
                System.out.print(nums[i] +" ");
                System.out.println();cursum = cursum - nums[i-k] + nums[i];
            } else cursum += nums[i];
            sum = Math.max(sum, cursum);
        }
        return (double)sum/k;
    }
}