/*
 * Submission: 1786240383
 * Problem: Largest Perimeter Triangle (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-29 12:45:49 UTC
 * Runtime: 8 ms
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