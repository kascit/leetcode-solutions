/*
 * Submission: 1605818127
 * Problem: Find Peak Element (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 17:12:35 UTC
 * Runtime: 0 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;        
    }
}