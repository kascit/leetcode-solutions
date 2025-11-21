/*
 * Submission: 1764008358
 * Problem: Minimum Difference Between Highest and Lowest of K Scores (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-08 16:30:53 UTC
 * Runtime: 5 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 100000, len = nums.length;
        // System.out.println(Arrays.toString(nums));
        for (int i = 0; i <= len - k; i++) {
            min = Math.min(min,nums[i+k-1]-nums[i]);
        } return min;
    }
}