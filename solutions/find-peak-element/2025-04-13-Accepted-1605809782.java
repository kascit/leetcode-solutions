/*
 * Submission: 1605809782
 * Problem: Find Peak Element (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 17:03:23 UTC
 * Runtime: 0 ms
 * Memory: 42.7 MB
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int l = 1, r = nums.length - 2;
        int n = nums.length;
        if (nums.length == 1) return 0;
        if (nums.length >= 2) {if (nums[0] > nums[1]) return 0; else if (nums[n-1] > nums[n-2]) return n-1;}
        while ( l < r){
            int mid = l + (r-l)/2;
            if (nums[mid] > nums[mid+1]) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}