/*
 * Submission: 1716936455
 * Problem: Search Insert Position (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 10:11:44 UTC
 * Runtime: 0 ms
 * Memory: 42.6 MB
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r){
            int mid = l + (r-l)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}