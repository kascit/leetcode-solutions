/*
 * Submission: 1739409815
 * Problem: Minimum Common Value (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 08:54:23 UTC
 * Runtime: 2 ms
 * Memory: 62.6 MB
 */

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l = 0, r = 0, len = nums1.length, len2 = nums2.length;
        while( l < len && r < len2){
            if (nums1[l] == nums2[r]) return nums2[r];
            else if (nums1[l] < nums2[r]){
                l++;
            } else r++;
        }
        return -1;
    }
}