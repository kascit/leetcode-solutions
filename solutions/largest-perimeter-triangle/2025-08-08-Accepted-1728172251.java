/*
 * Submission: 1728172251
 * Problem: Largest Perimeter Triangle (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-08 16:55:25 UTC
 * Runtime: 7 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = len - 1; i >= 2; i--){
            if (nums[i] < nums[i-1] + nums[i-2]) return nums[i]+ nums[i-1]+ nums[i-2];
        } return 0;
    }
}