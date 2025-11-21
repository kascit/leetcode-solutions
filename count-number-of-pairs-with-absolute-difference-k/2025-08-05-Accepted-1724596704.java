/*
 * Submission: 1724596704
 * Problem: Count Number of Pairs With Absolute Difference K (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 16:06:30 UTC
 * Runtime: 7 ms
 * Memory: 43.3 MB
 */

class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0, len = nums.length;
        for (int i = 0; i < len - 1; i++){
            for (int j = i + 1; j < len; j++){
                if (Math.abs(nums[i] - nums[j]) == k) count++;
            }
        } return count;

    }
}