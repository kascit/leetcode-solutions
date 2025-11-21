/*
 * Submission: 1605817794
 * Problem: Find Peak Element (Medium)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-04-13 17:12:15 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
            if (left == right && right == mid) break;
        }

        return left;        
    }
}