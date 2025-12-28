/*
 * Submission: 1763975582
 * Problem: Binary Search (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-08 16:05:24 UTC
 * Runtime: 0 ms
 * Memory: 45.9 MB
 */

class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int mid = l + (r - l)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return -1;

    }
}